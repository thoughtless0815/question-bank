package spl.question.bank.model.question.mcq;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GeneralMCQDetail {

  private String questionBody;
  private String option1;
  private String option2;
  private String option3;
  private String option4;
  private int answer;
}
