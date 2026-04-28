package c9;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.adyen.checkout.components.core.Address;
import com.braze.h2;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    private Context mContext;
    private int mId;
    private d mListener;
    private c mOnLoadCanceledListener;
    private boolean mStarted = false;
    private boolean mAbandoned = false;
    private boolean mReset = true;
    private boolean mContentChanged = false;
    private boolean mProcessingChange = false;

    public e(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    @NonNull
    public String dataToString(Object obj) {
        StringBuilder sb2 = new StringBuilder(64);
        if (obj == null) {
            sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
        } else {
            Class<?> cls = obj.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}");
        }
        return sb2.toString();
    }

    public void deliverResult(Object obj) {
        d dVar = this.mListener;
        if (dVar != null) {
            b9.b bVar = (b9.b) dVar;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                bVar.k(obj);
            } else {
                bVar.i(obj);
            }
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }

    public void forceLoad() {
        onForceLoad();
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public abstract boolean onCancelLoad();

    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    public abstract void onForceLoad();

    public abstract void onStartLoading();

    public void registerListener(int i11, @NonNull d dVar) {
        if (this.mListener != null) {
            h2.b("There is already a listener registered");
        } else {
            this.mListener = dVar;
            this.mId = i11;
        }
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z11 = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z11;
        return z11;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=");
        return k.i(this.mId, "}", sb2);
    }

    public void unregisterListener(@NonNull d dVar) {
        d dVar2 = this.mListener;
        if (dVar2 == null) {
            h2.b("No listener register");
        } else if (dVar2 == dVar) {
            this.mListener = null;
        } else {
            i4.a.f("Attempting to unregister the wrong listener");
        }
    }

    public void unregisterOnLoadCanceledListener(@NonNull c cVar) {
        throw new IllegalStateException("No listener register");
    }

    public void deliverCancellation() {
    }

    public void onAbandon() {
    }

    public void onReset() {
    }

    public void onStopLoading() {
    }

    public void registerOnLoadCanceledListener(@NonNull c cVar) {
    }
}
