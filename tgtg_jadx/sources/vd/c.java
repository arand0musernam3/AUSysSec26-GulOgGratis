package vd;

import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements FunctionAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f42221a = new c();

    public final boolean equals(Object obj) {
        if ((obj instanceof c) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final u70.f getFunctionDelegate() {
        return new FunctionReferenceImpl(1, wd.a.class, "parseSvg", "parseSvg(Lokio/BufferedSource;)Lcoil3/svg/Svg;", 1);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
