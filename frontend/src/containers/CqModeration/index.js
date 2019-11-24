import React, { Component } from 'react';
import PropTypes from 'prop-types';
import moment from 'moment';
import { connect } from 'react-redux';
import { compose } from 'redux';
import { createStructuredSelector } from 'reselect';
import { Link } from 'react-router-dom';
import { MDBDataTable } from 'mdbreact';

import { extractNameObject, splitStringForContent } from 'utils/utils';
import { QuestionStatusType } from 'containers/McqStatusManager/StatusType';
import {
  makeAllClasses,
  makeAllSubjects,
  makeAllChapters,
} from 'state/login/selectors';

import { fetchCqForModerator } from 'state/question/action';
import {
  makePendingMcqsForModerator,
  makeApprovedMcqsByModerator,
  makeRejectedMcqsByModerator,
} from 'state/question/selectors';

const createDataForTable = (allCqs, allChapter, allClass, allSubject) => {
  const columns = [
    {
      label: 'Question',
      field: 'cq',
      sort: 'asc',
      width: 100,
    },
    {
      label: 'Class',
      field: 'className',
      sort: 'asc',
      width: 100,
    },
    {
      label: 'Subject',
      field: 'subjectName',
      sort: 'asc',
      width: 100,
    },
    {
      label: 'Chapter',
      field: 'chapterName',
      sort: 'asc',
      width: 100,
    },
    {
      label: 'Assigned at',
      field: 'createdAt',
      sort: 'asc',
      width: 100,
    },
  ];

  const rows = allCqs.map(cq => {
    let contentToShow = splitStringForContent(cq.get('stem'));

    const nameObject = extractNameObject(
      cq.get('chapterId'),
      allChapter,
      allClass,
      allSubject
    );

    const createdAt = moment(cq.get('createdAt')).format('YYYY-MM-DD');
    return {
      cq: (
        <Link to={`/moderate/cq/${cq.get('id')}`} style={{ color: 'blue' }}>
          {contentToShow}
        </Link>
      ),
      ...nameObject,
      createdAt,
    };
  });

  return { columns, rows: rows.toJS() };
};

export const SimpleMcqList = props => {
  const { allCqs, allChapter, allClass, allSubject, type } = props;

  return (
    <span>
      <div className="card">
        <div className={`card-header bg-dark text-light`}>
          <b>
            {type === QuestionStatusType.PENDING
              ? 'Pending CQ for moderation'
              : type === QuestionStatusType.APPROVED
              ? 'Approved CQ for moderation'
              : 'Rejected CQ for moderation'}
          </b>
        </div>
        <div className="card-body">
          {allCqs.size === 0 ? (
            <h5>No CQ Available</h5>
          ) : (
            <MDBDataTable
              small
              data={createDataForTable(
                allCqs,
                allChapter,
                allClass,
                allSubject
              )}
            />
          )}
        </div>
      </div>
    </span>
  );
};

class CqModeration extends Component {
  static propTypes = {
    type: PropTypes.string,
    fetchPendingForModerator: PropTypes.func,
    fetchApprovedByModerator: PropTypes.func,
    fetchRejectedByModerator: PropTypes.func,
    pendingMcqs: PropTypes.object,
    approvedMcqs: PropTypes.object,
    rejectedMcqs: PropTypes.object,
    allClass: PropTypes.any,
    allSubject: PropTypes.any,
    allChapter: PropTypes.any,
  };

  componentDidMount() {
    const {
      type,
      fetchApprovedByModerator,
      fetchPendingForModerator,
      fetchRejectedByModerator,
    } = this.props;
    type === QuestionStatusType.PENDING
      ? fetchPendingForModerator()
      : type === QuestionStatusType.APPROVED
      ? fetchApprovedByModerator()
      : fetchRejectedByModerator();
  }

  render() {
    const {
      type,
      allChapter,
      allClass,
      allSubject,
      pendingMcqs,
      approvedMcqs,
      rejectedMcqs,
    } = this.props;
    const allCqs =
      type === QuestionStatusType.PENDING
        ? pendingMcqs
        : type === QuestionStatusType.APPROVED
        ? approvedMcqs
        : rejectedMcqs;
    return (
      <div>
        <SimpleMcqList
          type={type}
          allCqs={allCqs}
          allChapter={allChapter}
          allClass={allClass}
          allSubject={allSubject}
        />
      </div>
    );
  }
}
const mapStateToProps = createStructuredSelector({
  allClass: makeAllClasses(),
  allChapter: makeAllChapters(),
  allSubject: makeAllSubjects(),
  pendingMcqs: makePendingMcqsForModerator(),
  rejectedMcqs: makeRejectedMcqsByModerator(),
  approvedMcqs: makeApprovedMcqsByModerator(),
});

const mapDispatchToProps = dispatch => ({
  fetchPendingForModerator: () =>
    dispatch(fetchMcqForModerator(QuestionStatusType.PENDING)),
  fetchApprovedByModerator: () =>
    dispatch(fetchMcqForModerator(QuestionStatusType.APPROVED)),
  fetchRejectedByModerator: () =>
    dispatch(fetchMcqForModerator(QuestionStatusType.REJECTED)),
});

const withConnect = connect(
  mapStateToProps,
  mapDispatchToProps
);

export default compose(withConnect)(CqModeration);