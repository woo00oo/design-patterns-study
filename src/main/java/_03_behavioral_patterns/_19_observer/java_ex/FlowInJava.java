package _03_behavioral_patterns._19_observer.java_ex;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class FlowInJava {

    public static void main(String[] args) {
        Flow.Publisher<String> publisher = new SubmissionPublisher<>(); //비동기처리

        Flow.Subscriber<String> subscriber = new Flow.Subscriber<String>() {

            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                System.out.println("sub!");
                this.subscription = subscription;
                this.subscription.request(1);
            }

            @Override
            public void onNext(String item) {
                System.out.println("onNext Called");
                System.out.println(Thread.currentThread().getName());
                System.out.println(item);
            }

            @Override
            public void onError(Throwable throwable) {
            }

            @Override
            public void onComplete() {
                System.out.println("completed");
            }
        };

        publisher.subscribe(subscriber);
        ((SubmissionPublisher) publisher).submit("hello java");

        System.out.println("----------동기, 비동기");
    }
}
