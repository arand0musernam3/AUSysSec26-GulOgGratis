package a30;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f657a;

    public j(String str, int i11) {
        switch (i11) {
            case 2:
                this.f657a = str.concat("_");
                break;
            default:
                this.f657a = r8.k.g(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
                break;
        }
    }

    public static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e5) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e5);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return r8.k.m(str, " : ", str2);
    }

    public String a(Object obj) {
        String string = obj.toString();
        if (string != null && string.length() != 0) {
            int length = string.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = string.codePointAt(iCharCount);
                if (Character.isLetterOrDigit(iCodePointAt)) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            return this.f657a + obj;
        }
        i4.a.f(e0.f.k("Invalid key: ", string));
        return null;
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", e(this.f657a, str, objArr));
        }
    }

    public void c(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e(this.f657a, str, objArr), remoteException);
        }
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", e(this.f657a, str, objArr));
        }
    }
}
