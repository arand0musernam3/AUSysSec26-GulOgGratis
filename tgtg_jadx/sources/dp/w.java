package dp;

import android.content.Context;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.item.response.BasicItem;
import f0.f2;
import g3.w6;
import g3.x6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.b1;
import mv.r0;
import ok.h0;
import y80.m1;
import zendesk.android.messaging.UrlSource;
import zendesk.core.ui.android.internal.model.MessageSourceType;
import zendesk.messaging.android.internal.conversationscreen.ConversationFragment;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15127a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15132f;

    public /* synthetic */ w(sk.b bVar, BasicItem basicItem, String str, String str2, boolean z11) {
        this.f15131e = bVar;
        this.f15129c = basicItem;
        this.f15130d = str;
        this.f15132f = str2;
        this.f15128b = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15127a) {
            case 0:
                Context context = (Context) this.f15131e;
                Function0 function0 = (Function0) this.f15129c;
                Function0 function02 = (Function0) this.f15130d;
                b1 b1Var = (b1) this.f15132f;
                if (!this.f15128b) {
                    function02.invoke();
                } else if (r0.u(context)) {
                    b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                    function0.invoke();
                }
                return Unit.f26487a;
            case 1:
                return new w6(this.f15128b, (Function0) this.f15129c, (Function0) this.f15130d, (x6) this.f15131e, (Function1) this.f15132f);
            case 2:
                sk.b bVar = (sk.b) this.f15131e;
                BasicItem basicItem = (BasicItem) this.f15129c;
                String str = (String) this.f15130d;
                String str2 = (String) this.f15132f;
                m1.a aVar = ((qk.l) bVar.f39045a.getValue()).f37190e;
                String strM299constructorimpl = str2 != null ? VoucherId.m299constructorimpl(str2) : null;
                aVar.getClass();
                basicItem.getClass();
                ((m1) ((f2) aVar.f28697a).f16653f).i(new ok.n(new h0(basicItem, str, strM299constructorimpl, this.f15128b)));
                bVar.dismiss();
                return Unit.f26487a;
            default:
                return ConversationFragment.uriHandler$lambda$2$lambda$1((UrlSource) this.f15131e, (ConversationFragment) this.f15129c, (String) this.f15130d, this.f15128b, (MessageSourceType) this.f15132f);
        }
    }

    public /* synthetic */ w(UrlSource urlSource, ConversationFragment conversationFragment, String str, boolean z11, MessageSourceType messageSourceType) {
        this.f15131e = urlSource;
        this.f15129c = conversationFragment;
        this.f15130d = str;
        this.f15128b = z11;
        this.f15132f = messageSourceType;
    }

    public /* synthetic */ w(boolean z11, Context context, Function0 function0, Function0 function02, b1 b1Var) {
        this.f15128b = z11;
        this.f15131e = context;
        this.f15129c = function0;
        this.f15130d = function02;
        this.f15132f = b1Var;
    }

    public /* synthetic */ w(boolean z11, Function0 function0, Function0 function02, x6 x6Var, Function1 function1) {
        this.f15128b = z11;
        this.f15129c = function0;
        this.f15130d = function02;
        this.f15131e = x6Var;
        this.f15132f = function1;
    }
}
