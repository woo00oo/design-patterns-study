package _02_structural_patterns._10_facade.after;

public class Client {

//    public static void main(String[] args) {
//        EmailSettings emailSettings = new EmailSettings();
//        emailSettings.setHost("127.0.0.1");
//
//        EmailSender emailSender = new EmailSender(emailSettings);
//        EmailMessage emailMessage = new EmailMessage();
//        emailMessage.setFrom("keesun");
//        emailMessage.setTo("whiteship");
//        emailMessage.setSubject("오징어게임");
//        emailMessage.setText("밖은 더 지옥이더라고..");
//
//        emailSender.sendEmail(emailMessage);
//
//    }
}

/*
    퍼사드 패턴
    > 복잡한 서브 시스템 의존성을 최소화하는 방법.

    장점
    - 서브 시스템에 대한 의존성을 한 곳으로 모을 수 있다.

    단점
    - 퍼사드 클래스가 서브 시스템에 대한 모든 의존성을 가지게 된다.

 */