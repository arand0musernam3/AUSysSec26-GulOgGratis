package fb;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import c1.q;
import c5.b4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements db.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile k f17541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f17542d = new ReentrantLock();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f17543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f17544b = new CopyOnWriteArrayList();

    public k(i iVar) {
        this.f17543a = iVar;
        if (iVar != null) {
            iVar.d(new se.b(this, 20));
        }
    }

    @Override // db.a
    public final void a(q qVar) {
        synchronized (f17542d) {
            try {
                if (this.f17543a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f17544b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    if (jVar.f17539b == qVar) {
                        arrayList.add(jVar);
                    }
                }
                this.f17544b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((j) it2.next()).f17538a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f17544b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (Intrinsics.areEqual(((j) it3.next()).f17538a, activity)) {
                                break;
                            }
                        }
                    }
                    a aVar = this.f17543a;
                    if (aVar != null) {
                        ((i) aVar).b(activity);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // db.a
    public final void b(Context context, l0.b bVar, q qVar) {
        Object next;
        WindowManager.LayoutParams attributes;
        iBinder = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            qVar.accept(new cb.h(n0.f26529a));
            return;
        }
        ReentrantLock reentrantLock = f17542d;
        reentrantLock.lock();
        try {
            a aVar = this.f17543a;
            if (aVar == null) {
                qVar.accept(new cb.h(n0.f26529a));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f17544b;
            boolean z11 = false;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (Intrinsics.areEqual(((j) it.next()).f17538a, activity)) {
                        z11 = true;
                        break;
                    }
                }
            }
            j jVar = new j(activity, bVar, qVar);
            copyOnWriteArrayList.add(jVar);
            if (z11) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (Intrinsics.areEqual(activity, ((j) next).f17538a)) {
                            break;
                        }
                    }
                }
                j jVar2 = (j) next;
                cb.h hVar = jVar2 != null ? jVar2.f17540c : null;
                if (hVar != null) {
                    jVar.f17540c = hVar;
                    jVar.f17539b.accept(hVar);
                }
            } else {
                i iVar = (i) aVar;
                Window window = activity.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (iBinder != null) {
                    iVar.c(iBinder, activity);
                } else {
                    activity.getWindow().getDecorView().addOnAttachStateChangeListener(new b4(iVar, activity));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
