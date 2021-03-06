package spl.question.bank.web.teacher;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spl.question.bank.model.question.DownloadCriteria;
import spl.question.bank.model.question.QuestionType;
import spl.question.bank.service.DownloadService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@Slf4j
@RequestMapping(value = "/api/headmaster")
public class DownloadController {

  private final DownloadService downloadService;

  public DownloadController(DownloadService downloadService) {
    this.downloadService = downloadService;
  }

  @RequestMapping(value = "/generate/paper", method = RequestMethod.POST)
  public ResponseEntity<?> generatePaper(@RequestBody DownloadCriteria downloadCriteria) {

    if (downloadCriteria.getQuestionType().equals(QuestionType.MCQ.name())) {
      return downloadService.generateMcqPaper(downloadCriteria);
    } else {
      return downloadService.generateCQPaper(downloadCriteria);
    }
  }

  @RequestMapping(value = "/download/{questionType}/{paperId}", method = RequestMethod.GET)
  public void downloadPaper(
      @PathVariable("questionType") QuestionType questionType,
      @PathVariable("paperId") Integer paperId,
      HttpServletResponse response)
      throws IOException {

    if (questionType.equals(QuestionType.MCQ)) {
      downloadService.downloadMcqPaper(response, paperId);
    } else {
      downloadService.downloadCqPaper(response, paperId);
    }
  }

  @RequestMapping(
      value = "/download/archive/{id}",
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public ResponseEntity<?> getPaperFromArchive(@PathVariable Integer id) {
    return downloadService.getAllPaperById(id);
  }
}
