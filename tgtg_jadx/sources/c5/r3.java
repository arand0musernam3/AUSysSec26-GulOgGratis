package c5;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r3 implements s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r3 f7360a = new r3();

    /* JADX WARN: Type inference failed for: r2v0, types: [T, b5.r1] */
    @Override // c5.s3
    public final Function0 j(a aVar) {
        if (!aVar.isAttachedToWindow()) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            q3 q3Var = new q3(aVar, objectRef);
            aVar.addOnAttachStateChangeListener(q3Var);
            objectRef.element = new b5.r1(5, aVar, q3Var);
            return new p3(objectRef);
        }
        LifecycleOwner lifecycleOwnerA = androidx.lifecycle.m1.a(aVar);
        if (lifecycleOwnerA != null) {
            return t3.a(aVar, lifecycleOwnerA.getLifecycle());
        }
        y4.a.c("View tree for " + aVar + " has no ViewTreeLifecycleOwner");
        qc.y.m();
        return null;
    }
}
