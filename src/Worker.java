public class Worker implements OnTaskDoneListener, OnTaskErrorListener {
    @Override
    public void onDone(String result) {
    }
    @Override
    public void onError(String error) {

    }

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallBack;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallBack) {
        this.callback = callback;
        this.errorCallBack = errorCallBack;
    }

    public void start() {
        for (int i = 0; i <= 100; i++) {
            if(i == 33) errorCallBack.onError("Worker couldn't make task number " + i);
            if((i % 10) == 0) callback.onDone("Worker made " + i + " tasks");
        }
    }

}