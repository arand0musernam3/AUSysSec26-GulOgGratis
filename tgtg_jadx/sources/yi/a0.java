package yi;

import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.app.tgtg.feature.tabprofile.storelogin.ui.StoreSignupFragmentWeb;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.jvm.internal.Intrinsics;
import pg.w1;
import pg.y1;
import zendesk.core.ui.android.internal.xml.richtext.codeblock.CodeBlockHandler;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;
import zendesk.messaging.android.internal.conversationslistscreen.list.ConversationsListView;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;
import zendesk.ui.android.conversation.receipt.MessageReceiptView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45959b;

    public /* synthetic */ a0(Object obj, int i11) {
        this.f45958a = i11;
        this.f45959b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xs.c cVar;
        switch (this.f45958a) {
            case 0:
                f0 f0Var = (f0) this.f45959b;
                zi.e eVar = f0Var.f45983h;
                if (eVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("paymentCallbacks");
                    eVar = null;
                }
                boolean z11 = f0Var.A().f8334b0;
                BasicItem basicItemF = f0Var.A().f();
                aj.c cVarD = f0Var.A().d();
                String strJ = f0Var.B().j();
                if (strJ == null) {
                    strJ = AppConstants.RETURN_URL_ITEMVIEW_ADYEN;
                }
                eVar.n(z11, basicItemF, cVarD, strJ);
                f0Var.dismiss();
                break;
            case 1:
                MessageLogView.render$lambda$6$lambda$5((MessageLogView) this.f45959b);
                break;
            case 2:
                ConversationsListView.render$lambda$2((ConversationsListView) this.f45959b);
                break;
            case 3:
                ArticleContentView.AnonymousClass1.onPageStarted$lambda$0((ArticleContentView) this.f45959b);
                break;
            case 4:
                ((TextView) this.f45959b).setVisibility(0);
                break;
            case 5:
                MessageReceiptView.animateTailDrop$lambda$4$lambda$1((ImageView) this.f45959b);
                break;
            case 6:
                ((androidx.vectordrawable.graphics.drawable.h) this.f45959b).start();
                break;
            case 7:
                w1 w1Var = ((zm.a) this.f45959b).f47983a;
                w1Var.getClass();
                LottieAnimationView lottieAnimationView = w1Var.f35250s;
                lottieAnimationView.f8861k.add(he.i.PLAY_OPTION);
                lottieAnimationView.f8855e.o();
                break;
            case 8:
                y1 y1Var = ((zm.d) this.f45959b).f47992a;
                y1Var.getClass();
                LottieAnimationView lottieAnimationView2 = y1Var.f35280s;
                lottieAnimationView2.f8861k.add(he.i.PLAY_OPTION);
                lottieAnimationView2.f8855e.o();
                break;
            default:
                StoreSignupFragmentWeb storeSignupFragmentWeb = (StoreSignupFragmentWeb) this.f45959b;
                qt.a aVar = (qt.a) storeSignupFragmentWeb.p().f48102e.d();
                String str = (aVar == null || (cVar = (xs.c) aVar.f37268a) == null) ? null : cVar.f44495b;
                if (str != null) {
                    String strP = w.a0.p("setDirectAppLoginToken('", kotlin.text.y.n(kotlin.text.y.n(kotlin.text.y.n(kotlin.text.y.n(kotlin.text.y.n(str, "\\", "\\\\", false), "'", "\\'", false), "\n", CodeBlockHandler.NEWLINE_REGEX, false), "\r", "\\r", false), "\u2028", "\\u2028", false), "')");
                    WebView webView = storeSignupFragmentWeb.f48090j;
                    if (webView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webView");
                        webView = null;
                    }
                    webView.evaluateJavascript(strP, null);
                }
                break;
        }
    }
}
