package hb0;

import a3.l3;
import c5.f3;
import c5.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m2.a2;
import m2.e1;
import m2.j0;
import m2.u0;
import m5.k0;
import r5.y;
import zendesk.conversationkit.android.model.MessageStatus;
import zendesk.core.ui.android.internal.model.MessageDirection;
import zendesk.messaging.android.internal.conversationscreen.delegates.AdapterDelegatesHelper;
import zendesk.messaging.android.internal.model.MessageReceipt;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.ui.android.conversation.receipt.MessageReceiptRendering;
import zendesk.ui.android.conversation.receipt.MessageReceiptState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f21681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f21682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f21683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f21684g;

    public /* synthetic */ a(e1 e1Var, g4.v vVar, boolean z11, boolean z12, l3 l3Var, r5.s sVar) {
        this.f21678a = 2;
        this.f21679b = e1Var;
        this.f21680c = vVar;
        this.f21681d = z11;
        this.f21684g = z12;
        this.f21682e = l3Var;
        this.f21683f = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f3 f3Var;
        switch (this.f21678a) {
            case 0:
                return AdapterDelegatesHelper.renderReceipt$lambda$6$lambda$5((MessagingTheme) this.f21679b, (MessageReceipt) this.f21680c, this.f21681d, (MessageDirection) this.f21682e, (MessageStatus) this.f21683f, this.f21684g, (MessageReceiptState) obj);
            case 1:
                return AdapterDelegatesHelper.renderReceipt$lambda$6((MessagingTheme) this.f21679b, (MessageReceipt) this.f21680c, this.f21681d, (MessageDirection) this.f21682e, (MessageStatus) this.f21683f, this.f21684g, (MessageReceiptRendering) obj);
            default:
                e1 e1Var = (e1) this.f21679b;
                g4.v vVar = (g4.v) this.f21680c;
                l3 l3Var = (l3) this.f21682e;
                r5.s sVar = (r5.s) this.f21683f;
                h4.b bVar = (h4.b) obj;
                if (!e1Var.b()) {
                    g4.v.a(vVar);
                } else if (!this.f21681d && (f3Var = e1Var.f28820c) != null) {
                    ((z1) f3Var).b();
                }
                if (e1Var.b() && this.f21684g) {
                    if (e1Var.a() != u0.Selection) {
                        a2 a2VarD = e1Var.d();
                        if (a2VarD != null) {
                            long j9 = bVar.f21378a;
                            r5.h hVar = e1Var.f28821d;
                            j0 j0Var = e1Var.f28838v;
                            int i11 = sVar.i(a2VarD.b(j9, true));
                            j0Var.invoke(y.b(hVar.f37674a, null, k0.b(i11, i11), 5));
                            if (e1Var.f28818a.f28954a.f29538b.length() > 0) {
                                e1Var.f28828k.setValue(u0.Cursor);
                            }
                        }
                    } else {
                        l3Var.g(bVar);
                    }
                }
                return Unit.f26487a;
        }
    }

    public /* synthetic */ a(MessagingTheme messagingTheme, MessageReceipt messageReceipt, boolean z11, MessageDirection messageDirection, MessageStatus messageStatus, boolean z12, int i11) {
        this.f21678a = i11;
        this.f21679b = messagingTheme;
        this.f21680c = messageReceipt;
        this.f21681d = z11;
        this.f21682e = messageDirection;
        this.f21683f = messageStatus;
        this.f21684g = z12;
    }
}
