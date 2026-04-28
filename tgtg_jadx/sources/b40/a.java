package b40;

import android.app.Activity;
import android.util.Log;
import com.adyen.checkout.components.core.ComponentAvailableCallback;
import com.adyen.checkout.components.core.PaymentMethod;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.IInAppMessageViewWrapper;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.b0;
import d10.o;
import dz.g;
import e6.j;
import h2.a0;
import ib.k;
import ib.p;
import ib.q;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import v80.d0;
import v80.f0;
import v80.h1;
import v80.i1;
import wy.h;
import yi.r;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements d10.b, ez.a, IWebViewClientStateListener, d10.f, dz.e, j, ComponentAvailableCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5735d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(CoroutineContext coroutineContext, d0 d0Var, Function2 function2) {
        this.f5732a = 7;
        this.f5733b = coroutineContext;
        this.f5734c = d0Var;
        this.f5735d = (i) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046 A[PHI: r14
      0x0046: PHI (r14v25 zy.c) = (r14v18 zy.c), (r14v19 zy.c), (r14v20 zy.c), (r14v21 zy.c), (r14v22 zy.c), (r14v23 zy.c) binds: [B:11:0x0044, B:14:0x004e, B:17:0x0057, B:20:0x0060, B:23:0x0069, B:26:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // dz.e, x0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b40.a.apply(java.lang.Object):java.lang.Object");
    }

    @Override // ez.a
    public Object e() {
        bz.a aVar = (bz.a) this.f5733b;
        wy.i iVar = (wy.i) this.f5734c;
        h hVar = (h) this.f5735d;
        g gVar = aVar.f6771d;
        gVar.getClass();
        ty.d dVar = iVar.f43573c;
        String str = hVar.f43561a;
        String str2 = iVar.f43571a;
        String strConcat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.g(new a(gVar, hVar, iVar, 4))).getClass();
        aVar.f6768a.z(iVar, 1, false);
        return null;
    }

    @Override // d10.b
    public Object g(Task task) {
        d10.g gVar = (d10.g) this.f5733b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f5734c;
        d10.a aVar = (d10.a) this.f5735d;
        if (task.isSuccessful()) {
            gVar.d(task.getResult());
        } else if (task.getException() != null) {
            gVar.c(task.getException());
        } else if (atomicBoolean.getAndSet(true)) {
            ((o) aVar.f13696a.f39010b).q(null);
        }
        return Tasks.d(null);
    }

    @Override // d10.f
    public Task h(Object obj) {
        return ((FirebaseMessaging) this.f5733b).lambda$blockingGetToken$13((String) this.f5734c, (b0) this.f5735d, (String) obj);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // e6.j
    public Object o(e6.i iVar) {
        switch (this.f5732a) {
            case 7:
                CoroutineContext coroutineContext = (CoroutineContext) this.f5733b;
                d0 d0Var = (d0) this.f5734c;
                ?? r22 = (i) this.f5735d;
                iVar.a(new d1.e((i1) coroutineContext.get(h1.f42106a), 23), k.INSTANCE);
                return f0.B(f0.b(coroutineContext), null, d0Var, new a0((Function2) r22, iVar, (x70.c) null), 1);
            default:
                Executor executor = (Executor) this.f5733b;
                String str = (String) this.f5734c;
                Function0 function0 = (Function0) this.f5735d;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                iVar.a(new p(atomicBoolean, 0), k.INSTANCE);
                executor.execute(new q(atomicBoolean, iVar, function0, 0));
                return str;
        }
    }

    @Override // com.adyen.checkout.components.core.ComponentAvailableCallback
    public void onAvailabilityResult(boolean z11, PaymentMethod paymentMethod) {
        r rVar = (r) this.f5733b;
        PaymentMethods paymentMethods = (PaymentMethods) this.f5734c;
        List list = (List) this.f5735d;
        paymentMethod.getClass();
        if (rVar.v().Q) {
            return;
        }
        rVar.v().c(z11, paymentMethods, list);
    }

    @Override // com.braze.ui.inappmessage.listeners.IWebViewClientStateListener
    public void onPageFinished() {
        BrazeInAppMessageManager.displayInAppMessage$lambda$51((IInAppMessageViewWrapper) this.f5733b, (BrazeInAppMessageManager) this.f5734c, (Activity) this.f5735d);
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i11) {
        this.f5732a = i11;
        this.f5733b = obj;
        this.f5734c = obj2;
        this.f5735d = obj3;
    }
}
