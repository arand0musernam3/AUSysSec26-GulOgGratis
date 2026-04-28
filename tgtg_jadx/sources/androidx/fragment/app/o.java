package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f3283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f3286d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, ViewGroup viewGroup, Object obj, Ref.ObjectRef objectRef) {
        super(0);
        this.f3283a = pVar;
        this.f3284b = viewGroup;
        this.f3285c = obj;
        this.f3286d = objectRef;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.fragment.app.n] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Attempting to create TransitionSeekController");
        }
        p pVar = this.f3283a;
        h2 h2Var = pVar.f3298f;
        ViewGroup viewGroup = this.f3284b;
        Object obj = this.f3285c;
        Object objI = h2Var.i(viewGroup, obj);
        pVar.f3308q = objI;
        if (objI == null) {
            if (FragmentManager.L(2)) {
                Log.v("FragmentManager", "TransitionSeekController was not created.");
            }
            pVar.f3309r = true;
        } else {
            this.f3286d.element = new n(pVar, obj, viewGroup);
            if (FragmentManager.L(2)) {
                Log.v("FragmentManager", "Started executing operations from " + pVar.f3296d + " to " + pVar.f3297e);
            }
        }
        return Unit.f26487a;
    }
}
