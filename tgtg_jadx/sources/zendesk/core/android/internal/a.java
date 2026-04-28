package zendesk.core.android.internal;

import android.os.Parcelable;
import android.text.Editable;
import androidx.fragment.app.o0;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.storelogin.ui.StoreLoginActivity;
import com.app.tgtg.feature.tabprofile.storelogin.ui.StoreSignupFragmentWeb;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.managers.p;
import com.braze.models.IBrazeLocation;
import java.text.NumberFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;
import mv.a0;
import mv.z;
import zendesk.conversationkit.android.model.MessageAction;
import zendesk.core.ui.android.internal.model.ConversationEntry;
import zendesk.faye.FayeClientListener;
import zendesk.faye.internal.DefaultFayeClient;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationLogEntryMapper;
import zendesk.messaging.android.internal.conversationslistscreen.list.ConversationsListLoadMoreViewHolder;
import zendesk.ui.android.common.connectionbanner.ConnectionBannerRendering;
import zendesk.ui.android.common.connectionbanner.ConnectionBannerState;
import zendesk.ui.android.common.connectionbanner.ConnectionBannerView;
import zendesk.ui.android.common.loadmore.LoadMoreState;
import zendesk.ui.android.conversation.articleviewer.ArticleViewerState;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentCarouselRecyclerViewAdapter;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentItem;
import zendesk.ui.android.conversation.composer.MessageComposerView;
import zendesk.ui.android.conversation.form.FieldRendering;
import zendesk.ui.android.conversation.form.FieldView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47623b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f47622a = i11;
        this.f47623b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f47622a;
        Object obj2 = this.f47623b;
        switch (i11) {
            case 0:
                return DateKtxKt.formatToLocalisedNumbersWithReplace$lambda$2((NumberFormat) obj2, (MatchResult) obj);
            case 1:
                return Boolean.valueOf(DefaultFayeClient.removeListener$lambda$0((FayeClientListener) obj2, (FayeClientListener) obj));
            case 2:
                return GuideArticleViewerBottomSheetFragment.renderError$lambda$11$lambda$10((GuideArticleViewerState.Error) obj2, (ArticleViewerState) obj);
            case 3:
                return GuideArticleViewerBottomSheetFragment.renderLoading$lambda$9$lambda$8((GuideArticleViewerState.Loading) obj2, (ArticleViewerState) obj);
            case 4:
                return ConversationLogEntryMapper.getMessageContent$lambda$8$lambda$7((ConversationLogEntryMapper) obj2, (MessageAction) obj);
            case 5:
                return ConversationsListLoadMoreViewHolder.onBind$lambda$2$lambda$1((ConversationEntry.LoadMore) obj2, (LoadMoreState) obj);
            case 6:
                return ConnectionBannerView.onRestoreInstanceState$lambda$3$lambda$2((Parcelable) obj2, (ConnectionBannerState) obj);
            case 7:
                return ConnectionBannerView.onRestoreInstanceState$lambda$3((ConnectionBannerView.SavedState) obj2, (ConnectionBannerRendering) obj);
            case 8:
                return ArticleAttachmentCarouselRecyclerViewAdapter.onBindViewHolder$lambda$0((ArticleAttachmentCarouselRecyclerViewAdapter) obj2, (ArticleAttachmentItem) obj);
            case 9:
                return MessageComposerView._init_$lambda$1((MessageComposerView) obj2, (Editable) obj);
            case 10:
                return FieldView._init_$lambda$2((FieldView) obj2, (FieldRendering) obj);
            case 11:
                StoreSignupFragmentWeb storeSignupFragmentWeb = (StoreSignupFragmentWeb) obj2;
                if (((String) obj) != null) {
                    o0 activity = storeSignupFragmentWeb.getActivity();
                    activity.getClass();
                    a0 a0Var = new a0();
                    z zVar = z.MY_STORE;
                    zVar.getClass();
                    a0Var.f30138a = zVar;
                    a0Var.f30145h = R.anim.rotate_in;
                    a0Var.f30146i = R.anim.rotate_out;
                    a0Var.c((StoreLoginActivity) activity);
                }
                return Unit.f26487a;
            case 12:
                return BrazeGeofenceManager.requestSingleLocationUpdateFromGooglePlay$lambda$42((BrazeGeofenceManager) obj2, (IBrazeLocation) obj);
            default:
                return p.a((p) obj2, (IBrazeLocation) obj);
        }
    }
}
