package zendesk.ui.android.conversation.composer;

import androidx.lifecycle.o0;
import com.app.tgtg.model.remote.discover.request.DiscoverAllBucketsRequest;
import com.app.tgtg.model.remote.discover.request.DiscoverSingleBucketRequest;
import com.app.tgtg.model.remote.discover.request.SupportedBucket;
import com.app.tgtg.model.remote.widgets.response.FavouriteWidgetResponse;
import com.braze.managers.BrazeGeofenceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.ui.android.conversation.composer.MessageComposerRendering;
import zendesk.ui.android.conversation.conversationextension.ConversationExtensionRendering;
import zendesk.ui.android.internal.ImageLoaderFactory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47823a;

    public /* synthetic */ b(int i11) {
        this.f47823a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f47823a) {
            case 0:
                return MessageComposerRendering.Builder.onTyping$lambda$2();
            case 1:
                return ConversationExtensionRendering.Builder.onRetryButtonClicked$lambda$0();
            case 2:
                return ConversationExtensionRendering.Builder.onCloseButtonClicked$lambda$1();
            case 3:
                return ConversationExtensionRendering.Builder.onWebSdkClose$lambda$2();
            case 4:
                return ConversationExtensionRendering.Builder.onWebViewError$lambda$3();
            case 5:
                return ConversationExtensionRendering.Builder.onPageLoadingComplete$lambda$6();
            case 6:
                return ConversationExtensionRendering.Builder.onBackButtonClicked$lambda$7();
            case 7:
                return Unit.f26487a;
            case 8:
                return Unit.f26487a;
            case 9:
                return ImageLoaderFactory.getImageLoader$lambda$5$lambda$0();
            case 10:
                return new o0();
            case 11:
                return new o0();
            case 12:
                return new o0();
            case 13:
                return new o0();
            case 14:
                return new o0();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new m90.d(zk.a.f47958a, 0);
            case 16:
                return new m90.d(zn.f.f48001a, 0);
            case 17:
                return Unit.f26487a;
            case 18:
                return DiscoverAllBucketsRequest._childSerializers$_anonymous_();
            case 19:
                return DiscoverAllBucketsRequest._childSerializers$_anonymous_$0();
            case 20:
                return DiscoverSingleBucketRequest._childSerializers$_anonymous_();
            case 21:
                return SupportedBucket._childSerializers$_anonymous_();
            case 22:
                return FavouriteWidgetResponse._childSerializers$_anonymous_();
            case 23:
                return BrazeGeofenceManager.tearDownGeofences$lambda$15();
            case 24:
                return BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$4();
            case 25:
                return BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$5();
            case 26:
                return BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$6();
            case 27:
                return BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$7();
            case 28:
                return BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$10();
            default:
                return BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$9();
        }
    }
}
