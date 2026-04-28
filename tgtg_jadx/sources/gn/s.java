package gn;

import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20656d;

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, int i11) {
        this.f20653a = i11;
        this.f20654b = obj;
        this.f20655c = obj2;
        this.f20656d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [T, java.lang.Object] */
    @Override // androidx.lifecycle.c0
    public final void onStateChanged(LifecycleOwner lifecycleOwner, androidx.lifecycle.w wVar) {
        switch (this.f20653a) {
            case 0:
                f2.c0 c0Var = (f2.c0) this.f20654b;
                dn.k kVar = (dn.k) this.f20655c;
                z3.u uVar = (z3.u) this.f20656d;
                if (wVar == androidx.lifecycle.w.ON_RESUME) {
                    List list = c0Var.j().f17192k;
                    ArrayList arrayList = new ArrayList(e0.o(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((f2.t) ((f2.m) it.next())).f17199a));
                    }
                    a.j(kVar, uVar, arrayList);
                }
                break;
            case 1:
                h7.r rVar = (h7.r) this.f20654b;
                Lifecycle.State state = (Lifecycle.State) this.f20655c;
                MenuProvider menuProvider = (MenuProvider) this.f20656d;
                rVar.getClass();
                Runnable runnable = rVar.f21614a;
                CopyOnWriteArrayList copyOnWriteArrayList = rVar.f21615b;
                androidx.lifecycle.w.Companion.getClass();
                if (wVar == androidx.lifecycle.u.c(state)) {
                    copyOnWriteArrayList.add(menuProvider);
                    runnable.run();
                } else if (wVar == androidx.lifecycle.w.ON_DESTROY) {
                    rVar.a(menuProvider);
                } else if (wVar == androidx.lifecycle.u.a(state)) {
                    copyOnWriteArrayList.remove(menuProvider);
                    runnable.run();
                }
                break;
            default:
                w8.f fVar = (w8.f) this.f20654b;
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.f20655c;
                Function1 function1 = (Function1) this.f20656d;
                int i11 = w8.d.$EnumSwitchMapping$0[wVar.ordinal()];
                if (i11 == 1) {
                    objectRef.element = function1.invoke(fVar);
                    break;
                } else if (i11 == 2) {
                    e.e eVar = (e.e) objectRef.element;
                    if (eVar != null) {
                        eVar.a();
                    }
                    objectRef.element = null;
                    break;
                }
                break;
        }
    }
}
