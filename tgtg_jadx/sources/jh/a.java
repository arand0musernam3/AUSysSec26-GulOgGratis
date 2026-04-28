package jh;

import b4.t;
import bn.x;
import com.app.tgtg.model.remote.invitation.Invitation;
import com.app.tgtg.model.remote.invitation.InvitationState;
import g3.k8;
import g3.w6;
import gh.i;
import ir.h;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.h1;
import m3.m;
import m3.n;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25243a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f25244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u70.f f25245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f25249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f25250h;

    public /* synthetic */ a(t tVar, i iVar, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function0 function02, int i11) {
        this.f25246d = tVar;
        this.f25247e = iVar;
        this.f25244b = function0;
        this.f25248f = function1;
        this.f25249g = function12;
        this.f25250h = function13;
        this.f25245c = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25243a) {
            case 0:
                ((Integer) obj2).getClass();
                f.a((t) this.f25246d, (i) this.f25247e, this.f25244b, (Function1) this.f25248f, (Function1) this.f25249g, (Function1) this.f25250h, (Function0) this.f25245c, (n) obj, m3.i.F(385));
                return Unit.f26487a;
            case 1:
                List list = (List) this.f25246d;
                final b1 b1Var = (b1) this.f25247e;
                final Invitation invitation = (Invitation) this.f25248f;
                final Function0 function0 = (Function0) this.f25245c;
                final h1 h1Var = (h1) this.f25249g;
                final b1 b1Var2 = (b1) this.f25250h;
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final int i11 = 0;
                    for (Object obj3 : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            d0.n();
                            throw null;
                        }
                        String str = (String) obj3;
                        boolean z11 = h1Var.h() == i11;
                        final Function0 function02 = this.f25244b;
                        boolean zF = sVar.f(function02) | sVar.f(b1Var) | sVar.f(invitation) | sVar.f(function0) | sVar.d(i11);
                        Object objM = sVar.M();
                        if (zF || objM == m.f29332a) {
                            Function0 function03 = new Function0() { // from class: oo.w
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Function0 function04;
                                    h1 h1Var2 = h1Var;
                                    if (h1Var2.h() == 0 && (function04 = function02) != null) {
                                        function04.invoke();
                                    }
                                    b1 b1Var3 = b1Var;
                                    if (b1Var3 != null) {
                                        b1Var3.setValue(Boolean.FALSE);
                                    }
                                    Invitation invitation2 = invitation;
                                    if ((invitation2 != null ? invitation2.getState() : null) == InvitationState.PENDING) {
                                        h1Var2.i(1);
                                        Function0 function05 = function0;
                                        if (function05 != null) {
                                            function05.invoke();
                                        }
                                        b1Var2.setValue(Boolean.TRUE);
                                    } else {
                                        h1Var2.i(i11);
                                    }
                                    return Unit.f26487a;
                                }
                            };
                            sVar.k0(function03);
                            objM = function03;
                        }
                        k8.b(z11, (Function0) objM, null, false, u3.e.e(-1639734504, sVar, new x(i11, str, h1Var, 21)), 0L, 0L, sVar, 24576, 492);
                        i11 = i12;
                    }
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            case 2:
                ((Integer) obj2).getClass();
                ex.i.a((h) this.f25246d, this.f25244b, (Function1) this.f25248f, (Function1) this.f25249g, (Function1) this.f25250h, (Function1) this.f25247e, (Function1) this.f25245c, (n) obj, m3.i.F(1));
                return Unit.f26487a;
            default:
                ((Integer) obj2).getClass();
                na0.a.N((w6) this.f25246d, (yk.h) this.f25247e, (tg.i) this.f25248f, (np.b) this.f25249g, this.f25244b, (Function0) this.f25245c, (String) this.f25250h, (n) obj, m3.i.F(1));
                return Unit.f26487a;
        }
    }

    public /* synthetic */ a(w6 w6Var, yk.h hVar, tg.i iVar, np.b bVar, Function0 function0, Function0 function02, String str, int i11) {
        this.f25246d = w6Var;
        this.f25247e = hVar;
        this.f25248f = iVar;
        this.f25249g = bVar;
        this.f25244b = function0;
        this.f25245c = function02;
        this.f25250h = str;
    }

    public /* synthetic */ a(h hVar, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i11) {
        this.f25246d = hVar;
        this.f25244b = function0;
        this.f25248f = function1;
        this.f25249g = function12;
        this.f25250h = function13;
        this.f25247e = function14;
        this.f25245c = function15;
    }

    public /* synthetic */ a(List list, Function0 function0, b1 b1Var, Invitation invitation, Function0 function02, h1 h1Var, b1 b1Var2) {
        this.f25246d = list;
        this.f25244b = function0;
        this.f25247e = b1Var;
        this.f25248f = invitation;
        this.f25245c = function02;
        this.f25249g = h1Var;
        this.f25250h = b1Var2;
    }
}
