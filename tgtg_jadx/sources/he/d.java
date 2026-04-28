package he;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements ia.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f21872a;

    public /* synthetic */ d(Context context) {
        this.f21872a = context;
    }

    @Override // ia.a
    public ia.b a(e20.a aVar) {
        String str = (String) aVar.f15580d;
        androidx.constraintlayout.widget.z zVar = (androidx.constraintlayout.widget.z) aVar.f15581e;
        zVar.getClass();
        if (str != null && str.length() != 0) {
            return new ja.h(this.f21872a, str, zVar, true, true);
        }
        i4.a.f("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }
}
