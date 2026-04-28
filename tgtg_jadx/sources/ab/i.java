package ab;

import android.util.Log;
import androidx.window.core.WindowStrictModeException;
import java.util.Collection;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.collections.x;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends xz.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f1209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WindowStrictModeException f1210g;

    public i(Object obj, String str, a aVar, k kVar) {
        Collection collectionT;
        obj.getClass();
        kVar.getClass();
        this.f1207d = obj;
        this.f1208e = str;
        this.f1209f = kVar;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(str + " value: " + obj);
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length + (-2);
        length = length < 0 ? 0 : length;
        if (length < 0) {
            i4.a.i(r8.k.h(length, "Requested element count ", " is less than zero."));
            throw null;
        }
        if (length == 0) {
            collectionT = n0.f26529a;
        } else {
            int length2 = stackTrace.length;
            collectionT = length >= length2 ? y.T(stackTrace) : length == 1 ? c0.c(stackTrace[length2 - 1]) : x.c(x.l(stackTrace, length2 - length, length2));
        }
        windowStrictModeException.setStackTrace((StackTraceElement[]) collectionT.toArray(new StackTraceElement[0]));
        this.f1210g = windowStrictModeException;
    }

    @Override // xz.b
    public final Object p() throws WindowStrictModeException {
        int i11 = h.$EnumSwitchMapping$0[this.f1209f.ordinal()];
        if (i11 == 1) {
            throw this.f1210g;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                return null;
            }
            e40.a.f();
            return null;
        }
        Object obj = this.f1207d;
        obj.getClass();
        Log.d("g", this.f1208e + " value: " + obj);
        return null;
    }

    @Override // xz.b
    public final xz.b I(String str, Function1 function1) {
        return this;
    }
}
