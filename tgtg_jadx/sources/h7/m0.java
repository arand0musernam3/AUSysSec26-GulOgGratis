package h7;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends o0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f21591e;

    public m0(int i11, Class cls, int i12, int i13, int i14) {
        this.f21591e = i14;
        this.f21598a = i11;
        this.f21601d = cls;
        this.f21600c = i12;
        this.f21599b = i13;
    }

    @Override // h7.o0
    public final Object d(View view) {
        switch (this.f21591e) {
            case 0:
                return Boolean.valueOf(androidx.core.view.a.c(view));
            case 1:
                return androidx.core.view.a.a(view);
            case 2:
                return w0.b(view);
            default:
                return Boolean.valueOf(androidx.core.view.a.b(view));
        }
    }

    @Override // h7.o0
    public final void e(View view, Object obj) {
        switch (this.f21591e) {
            case 0:
                androidx.core.view.a.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                androidx.core.view.a.e(view, (CharSequence) obj);
                break;
            case 2:
                w0.d(view, (CharSequence) obj);
                break;
            default:
                androidx.core.view.a.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // h7.o0
    public final boolean h(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.f21591e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !zEquals;
    }
}
