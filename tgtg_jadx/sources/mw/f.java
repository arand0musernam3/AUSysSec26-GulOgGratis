package mw;

import com.braze.support.ReflectionUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30226a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f30227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30228c;

    public /* synthetic */ f(String str, Ref.ObjectRef objectRef) {
        this.f30228c = str;
        this.f30227b = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f30226a) {
            case 0:
                return ReflectionUtils.getDeclaredMethodQuietly$lambda$2(this.f30228c, this.f30227b);
            default:
                return com.braze.triggers.managers.a.a(this.f30227b, this.f30228c);
        }
    }

    public /* synthetic */ f(Ref.ObjectRef objectRef, String str) {
        this.f30227b = objectRef;
        this.f30228c = str;
    }
}
