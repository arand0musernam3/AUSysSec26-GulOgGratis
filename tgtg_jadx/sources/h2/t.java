package h2;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements z4.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f21219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f21220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21221c;

    public t(u uVar, Ref.ObjectRef objectRef, int i11) {
        this.f21219a = uVar;
        this.f21220b = objectRef;
        this.f21221c = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z4.e
    public final boolean a() {
        return this.f21219a.L0((n) this.f21220b.element, this.f21221c);
    }
}
