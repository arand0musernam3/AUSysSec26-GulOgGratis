package dz;

import android.content.Context;
import c50.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements yy.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t70.a f15249b;

    public /* synthetic */ c(t70.a aVar, int i11) {
        this.f15248a = i11;
        this.f15249b = aVar;
    }

    @Override // t70.a
    public final Object get() {
        switch (this.f15248a) {
            case 0:
                String packageName = ((Context) this.f15249b.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                w.l("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new j((Context) this.f15249b.get(), "com.google.android.datatransport.events", Integer.valueOf(j.f15265d).intValue());
        }
    }
}
