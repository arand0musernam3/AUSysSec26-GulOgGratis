package e4;

import b5.p2;
import c5.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f15736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f15737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f15738c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, i iVar, Ref.BooleanRef booleanRef) {
        super(1);
        this.f15736a = dVar;
        this.f15737b = iVar;
        this.f15738c = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i iVar = (i) obj;
        if (!iVar.isAttached()) {
            return p2.SkipSubtreeAndContinueTraversal;
        }
        if (iVar.f15744q != null) {
            y4.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
        }
        Function1 function1 = iVar.f15742o;
        k kVar = function1 != null ? (k) function1.invoke(this.f15736a) : null;
        iVar.f15744q = kVar;
        boolean z11 = kVar != null;
        if (z11) {
            ((b) ((y) b5.m.h(this.f15737b)).m67getDragAndDropManager()).f15729b.add(iVar);
        }
        Ref.BooleanRef booleanRef = this.f15738c;
        booleanRef.element = booleanRef.element || z11;
        return p2.ContinueTraversal;
    }
}
