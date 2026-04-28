package a60;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f845k;
    public final /* synthetic */ Class l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Executable f846m;

    public /* synthetic */ c(Executable executable, Class cls, int i11) {
        this.f845k = i11;
        this.f846m = executable;
        this.l = cls;
    }

    @Override // a60.h0
    public final Object f() {
        switch (this.f845k) {
            case 0:
                return ((Constructor) this.f846m).newInstance(null);
            default:
                return ((Method) this.f846m).invoke(null, this.l, Object.class);
        }
    }

    public final String toString() {
        switch (this.f845k) {
        }
        return this.l.getName();
    }
}
