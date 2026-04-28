package c9;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import com.braze.h2;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends e {
    private static final boolean DEBUG = false;
    private static final String TAG = "AsyncTaskLoader";
    private volatile a mCancellingTask;
    private Executor mExecutor;
    private Handler mHandler;
    private long mLastLoadCompleteTime;
    private volatile a mTask;
    private long mUpdateThrottle;

    public b(Context context) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
    }

    public void dispatchOnCancelled(a aVar, Object obj) {
        onCanceled(obj);
        if (this.mCancellingTask == aVar) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(a aVar, Object obj) {
        if (this.mTask != aVar) {
            dispatchOnCancelled(aVar, obj);
            return;
        }
        if (isAbandoned()) {
            onCanceled(obj);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(obj);
    }

    @Override // c9.e
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f7807e);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f7807e);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            printWriter.print(DateUtils.formatElapsedTime(this.mUpdateThrottle / 1000));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.mLastLoadCompleteTime == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime((SystemClock.uptimeMillis() - this.mLastLoadCompleteTime) / 1000);
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.f7807e) {
            this.mTask.f7807e = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.f7807e = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
            return;
        }
        if (this.mExecutor == null) {
            this.mExecutor = getExecutor();
        }
        a aVar = this.mTask;
        Executor executor = this.mExecutor;
        if (aVar.f7804b == i.PENDING) {
            aVar.f7804b = i.RUNNING;
            executor.execute(aVar.f7803a);
            return;
        }
        int i11 = h.f7813a[aVar.f7804b.ordinal()];
        if (i11 == 1) {
            h2.b("Cannot execute task: the task is already running.");
        } else if (i11 != 2) {
            h2.b("We should never reach this state");
        } else {
            h2.b("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    @NonNull
    public Executor getExecutor() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract Object loadInBackground();

    @Override // c9.e
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!isStarted()) {
            onContentChanged();
        }
        a aVar = this.mCancellingTask;
        a aVar2 = this.mTask;
        if (aVar != null) {
            if (aVar2.f7807e) {
                this.mTask.f7807e = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        boolean z11 = aVar2.f7807e;
        a aVar3 = this.mTask;
        if (z11) {
            aVar3.f7807e = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        aVar3.f7805c.set(true);
        boolean zCancel = aVar3.f7803a.cancel(false);
        if (zCancel) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zCancel;
    }

    @Override // c9.e
    public void onForceLoad() {
        cancelLoad();
        this.mTask = new a(this);
        executePendingTask();
    }

    public Object onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j9) {
        this.mUpdateThrottle = j9;
        if (j9 != 0) {
            this.mHandler = new Handler();
        }
    }

    public void cancelLoadInBackground() {
    }

    public void onCanceled(Object obj) {
    }
}
