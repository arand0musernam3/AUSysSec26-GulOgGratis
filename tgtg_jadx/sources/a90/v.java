package a90;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements ia.d, l8.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1051b;

    public v(String str) {
        this.f1050a = 1;
        this.f1051b = r8.k.g(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public static String d(String str, String str2, Object... objArr) {
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

    public void a(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f1051b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e5) {
            i4.a.d(e5);
        }
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", d(this.f1051b, str, objArr));
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", d(this.f1051b, str, objArr));
        }
    }

    @Override // l8.p
    public boolean h(CharSequence charSequence, int i11, int i12, l8.w wVar) {
        if (!TextUtils.equals(charSequence.subSequence(i11, i12), this.f1051b)) {
            return true;
        }
        wVar.f27493c = (wVar.f27493c & 3) | 4;
        return false;
    }

    @Override // ia.d
    public String l() {
        return this.f1051b;
    }

    public String toString() {
        switch (this.f1050a) {
            case 0:
                return l1.f(new StringBuilder("<"), this.f1051b, '>');
            default:
                return super.toString();
        }
    }

    @Override // l8.p
    public Object g() {
        return this;
    }

    @Override // ia.d
    public void n(ia.c cVar) {
    }

    public /* synthetic */ v(String str, int i11) {
        this.f1050a = i11;
        this.f1051b = str;
    }
}
