package jp.co.sss.lms.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * 日次の勤怠フォーム
 * 
 * @author 東京ITスクール
 */
@Data
public class DailyAttendanceForm {

	/** 受講生勤怠ID */
	private Integer studentAttendanceId;
	/** 途中退校日 */
	private String leaveDate;
	/** 日付 */
	private String trainingDate;
	/** 出勤時間 */
	@NotBlank(message = "{attendance.punchInEmpty}")
	private String trainingStartTime;
	//田垣貴生 - Task.26, Task.27(入力チェック)
	/** 出勤時間 時（画面表示用） */
	@NotBlank(message = "{input.invalid}")
	private Integer trainingStartTimeHour;
	/** 出勤時間 分（画面表示用） */
	@NotBlank(message = "{input.invalid}")
	private Integer trainingStartTimeMinute;
	/** 退勤時間 */
	@NotBlank(message = "{attendance.punchInEmpty}")
	private String trainingEndTime;
	/** 退勤時間 時（画面表示用）*/	
	//田垣貴生 - Task.26, Task.27(入力チェック)
	@NotBlank(message = "{input.invalid}")
	private Integer trainingEndTimeHour;
	/** 退勤時間 分（画面表示用）*/
	@NotBlank(message = "{input.invalid}")
	private Integer trainingEndTimeMinute;
	/** 中抜け時間 */
//	@Max (value <= trainingEndTime - trainingStartTime, message = "")
	private Integer blankTime;
	/** 中抜け時間（画面表示用） */
	private String blankTimeValue;
	/** ステータス */
	private String status;
	/** 備考 */
	//田垣貴生 - Task.27
	@Size(max = 100, message = "{maxlength}")
	private String note;
	/** セクション名 */
	private String sectionName;
	/** 当日フラグ */
	private Boolean isToday;
	/** エラーフラグ */
	private Boolean isError;
	/** 日付（画面表示用） */
	private String dispTrainingDate;
	/** ステータス（画面表示用） */
	private String statusDispName;
	/** LMSユーザーID */
	private String lmsUserId;
	/** ユーザー名 */
	private String userName;
	/** コース名 */
	private String courseName;
	/** インデックス */
	private String index;

}
