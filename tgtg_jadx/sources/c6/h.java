package c6;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f7693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f7694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f7695d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7696a;

    static {
        int i11 = 0;
        f7693b = new h(i11, 0);
        f7694c = new h(i11, 1);
        f7695d = new h(i11, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i11, int i12) {
        super(i11);
        this.f7696a = i12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f7696a) {
        }
        return Unit.f26487a;
    }
}
