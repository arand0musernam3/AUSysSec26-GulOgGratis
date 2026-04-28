package yl;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.feature.logincharity.ui.model.Country;
import com.app.tgtg.feature.tabprofile.storelogin.ui.StoreSignupFragmentWeb;
import com.braze.events.internal.t;
import com.braze.managers.d1;
import com.braze.managers.g0;
import com.braze.managers.h1;
import com.braze.managers.j;
import com.braze.managers.n;
import com.braze.managers.r;
import com.braze.managers.y0;
import com.braze.models.Banner;
import com.braze.models.k;
import com.braze.ui.support.ViewUtils;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import mv.r0;
import org.bouncycastle.iana.AEADAlgorithm;
import yi.a0;
import zendesk.conversationkit.android.internal.Effect;
import zendesk.conversationkit.android.internal.EffectMapper;
import zendesk.conversationkit.android.model.MessageAction;
import zendesk.core.ui.android.internal.model.ConversationEntry;
import zendesk.messaging.android.internal.AttachmentIntentsLauncher;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationCellFactory;
import zendesk.messaging.android.internal.conversationslistscreen.list.ConversationsListLoadMoreViewHolder;
import zendesk.ui.android.conversation.form.FormView;
import zendesk.ui.android.conversation.imagecell.ImageCellState;
import zendesk.ui.android.conversation.imagecell.ImageCellView;
import zendesk.ui.android.internal.ViewKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46146c;

    public /* synthetic */ e(AttachmentIntentsLauncher attachmentIntentsLauncher, Function1 function1) {
        this.f46144a = 4;
        this.f46146c = attachmentIntentsLauncher;
        this.f46145b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f46144a) {
            case 0:
                ((Function1) this.f46145b).invoke((Country) this.f46146c);
                return Unit.f26487a;
            case 1:
                return ViewUtils.removeViewFromParent$lambda$1((View) this.f46145b, (ViewGroup) this.f46146c);
            case 2:
                return EffectMapper.mapLoadMoreMessages$lambda$26$lambda$24((List) this.f46145b, (Effect.LoadMoreMessages) this.f46146c);
            case 3:
                return EffectMapper.mapMessageReceived$lambda$23$lambda$22((MessageAction.WebView) this.f46145b, (Effect.MessageReceived) this.f46146c);
            case 4:
                return AttachmentIntentsLauncher.launchCamera$lambda$4((AttachmentIntentsLauncher) this.f46146c, (Function1) this.f46145b);
            case 5:
                return MessageLogView.showSeeLatestViewIfNeeded$lambda$28$lambda$26((MessageLogView) this.f46145b, (List) this.f46146c);
            case 6:
                return MessageLogView.onScrollToBottomIfKeyboardShown$lambda$14((RecyclerView) this.f46145b, (MessageLogView) this.f46146c);
            case 7:
                return ConversationCellFactory.mapToConversationCellState$lambda$3((Function1) this.f46145b, (ConversationEntry.ConversationItem) this.f46146c);
            case 8:
                return ConversationsListLoadMoreViewHolder.onBind$lambda$2$lambda$0((ConversationsListLoadMoreViewHolder) this.f46145b, (ConversationEntry.LoadMore) this.f46146c);
            case 9:
                return FormView.nextActionButtonClicked$lambda$19$lambda$18((FormView) this.f46145b, (Function0) this.f46146c);
            case 10:
                return ImageCellView.render$lambda$13$lambda$7((ImageCellState) this.f46145b, (ImageCellView) this.f46146c);
            case 11:
                return ViewKt.ViewTreeObserverOnGlobalLayoutListenerC04671.onGlobalLayout$lambda$0((MaterialAutoCompleteTextView) this.f46145b, (ViewKt.ViewTreeObserverOnGlobalLayoutListenerC04671) this.f46146c);
            case 12:
                WebView webView = (WebView) this.f46145b;
                StoreSignupFragmentWeb storeSignupFragmentWeb = (StoreSignupFragmentWeb) this.f46146c;
                Context context = webView.getContext();
                context.getClass();
                Activity activityE = r0.e(context);
                if (activityE != null) {
                    activityE.runOnUiThread(new a0(storeSignupFragmentWeb, 9));
                }
                return Unit.f26487a;
            case 13:
                return com.braze.managers.g.a((String) this.f46145b, (View) this.f46146c);
            case 14:
                return com.braze.managers.g.a((com.braze.managers.d) this.f46145b, (String) this.f46146c);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return g0.a((g0) this.f46145b, (Integer) this.f46146c);
            case 16:
                return h1.a((t) this.f46145b, (d1) this.f46146c);
            case 17:
                return j.a((j) this.f46145b, (List) this.f46146c);
            case 18:
                return j.a((String) this.f46145b, (Banner) this.f46146c);
            case 19:
                return n.a((n) this.f46145b, (String) this.f46146c);
            case 20:
                return r.a((r) this.f46145b, (k) this.f46146c);
            default:
                return y0.a((List) this.f46145b, (ArrayList) this.f46146c);
        }
    }

    public /* synthetic */ e(int i11, Object obj, Object obj2) {
        this.f46144a = i11;
        this.f46145b = obj;
        this.f46146c = obj2;
    }
}
