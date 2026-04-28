package j2;

import b5.r1;
import b5.s1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f extends FunctionReferenceImpl implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f24442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f24443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f24444c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, s1 s1Var, r1 r1Var) {
        super(0, Intrinsics.Kotlin.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.f24442a = gVar;
        this.f24443b = s1Var;
        this.f24444c = r1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return g.L0(this.f24442a, this.f24443b, this.f24444c);
    }
}
