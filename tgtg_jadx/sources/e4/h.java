package e4;

import b5.p2;
import b5.q2;
import c5.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o30.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f15739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f15740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f15741c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Ref.ObjectRef objectRef, i iVar, d dVar) {
        super(1);
        this.f15739a = objectRef;
        this.f15740b = iVar;
        this.f15741c = dVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, b5.q2] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ?? r42 = (q2) obj;
        i iVar = (i) r42;
        if (!((b) ((y) b5.m.h(this.f15740b)).m67getDragAndDropManager()).f15729b.contains(iVar) || !j.a(iVar, e0.x(this.f15741c))) {
            return p2.ContinueTraversal;
        }
        this.f15739a.element = r42;
        return p2.CancelTraversal;
    }
}
