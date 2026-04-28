package cc;

import app.cash.paykit.core.models.response.CustomerResponseData;
import app.cash.paykit.core.models.response.CustomerTopLevelResponse;
import app.cash.paykit.core.utils.ThreadPurpose;
import kotlin.jvm.internal.Intrinsics;
import yb.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f7886b;

    public /* synthetic */ a(c cVar, int i11) {
        this.f7885a = i11;
        this.f7886b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7885a) {
            case 0:
                c cVar = this.f7886b;
                g gVar = cVar.f7890b;
                String str = cVar.f7889a;
                CustomerResponseData customerResponseData = cVar.f7897i;
                customerResponseData.getClass();
                ec.c cVarA = gVar.a(str, customerResponseData.f4687d);
                if (!(cVarA instanceof ec.a)) {
                    CustomerResponseData customerResponseData2 = ((CustomerTopLevelResponse) ((ec.b) cVarA).f15917a).f4706a;
                    cVar.f7897i = customerResponseData2;
                    boolean zAreEqual = Intrinsics.areEqual(customerResponseData2 != null ? customerResponseData2.f4690g : null, "APPROVED");
                    CustomerResponseData customerResponseData3 = cVar.f7897i;
                    if (zAreEqual) {
                        customerResponseData3.getClass();
                        cVar.d(new yb.e(customerResponseData3));
                    } else if (!Intrinsics.areEqual(customerResponseData3 != null ? customerResponseData3.f4690g : null, "PENDING")) {
                        cVar.d(h.f45818b);
                    } else {
                        try {
                            Thread.sleep(500L);
                            zz.f.D(cVar.f7895g.t(ThreadPurpose.CHECK_APPROVAL_STATUS, new a(cVar, 0)), "Could not start checkForApprovalThread.", cVar.f7894f, ac.a.f1220a);
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                } else {
                    cVar.d(new yb.g(((ec.a) cVarA).f15916a));
                }
                break;
            default:
                c cVar2 = this.f7886b;
                g gVar2 = cVar2.f7890b;
                String str2 = cVar2.f7889a;
                CustomerResponseData customerResponseData4 = cVar2.f7897i;
                customerResponseData4.getClass();
                ec.c cVarA2 = gVar2.a(str2, customerResponseData4.f4687d);
                boolean z11 = cVarA2 instanceof ec.a;
                jb.b bVar = cVar2.f7894f;
                if (!z11) {
                    bVar.s("CashAppPay", "Refreshed customer request with SUCCESS");
                    cVar2.f7897i = ((CustomerTopLevelResponse) ((ec.b) cVarA2).f15917a).f4706a;
                    if (Intrinsics.areEqual(cVar2.f7898j, h.f45821e)) {
                        CustomerResponseData customerResponseData5 = cVar2.f7897i;
                        customerResponseData5.getClass();
                        cVar2.a(customerResponseData5);
                    }
                } else {
                    Exception exc = ((ec.a) cVarA2).f15916a;
                    bVar.r("CashAppPay", "Failed to refresh expired auth token customer request.", exc);
                    cVar2.d(new yb.g(exc));
                }
                break;
        }
    }
}
