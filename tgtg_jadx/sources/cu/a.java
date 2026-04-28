package cu;

import android.content.res.Resources;
import com.app.tgtg.model.remote.item.FlashSalesItemInformation;
import com.app.tgtg.model.remote.item.Ingredients;
import com.app.tgtg.model.remote.item.MagicBagItemInformation;
import com.app.tgtg.model.remote.item.ManufacturerItemInformation;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.outgoing.d;
import com.braze.models.outgoing.h;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.conversationkit.android.model.Author;
import zendesk.conversationkit.android.model.AuthorSubtype;
import zendesk.conversationkit.android.model.AuthorType;
import zendesk.conversationkit.android.model.Conversation;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13427a;

    public /* synthetic */ a(int i11) {
        this.f13427a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f13427a) {
            case 0:
                return FlashSalesItemInformation._childSerializers$_anonymous_$1();
            case 1:
                return Ingredients._childSerializers$_anonymous_();
            case 2:
                return MagicBagItemInformation._childSerializers$_anonymous_();
            case 3:
                return MagicBagItemInformation._childSerializers$_anonymous_$0();
            case 4:
                return MagicBagItemInformation._childSerializers$_anonymous_$1();
            case 5:
                return ManufacturerItemInformation._childSerializers$_anonymous_();
            case 6:
                return ManufacturerItemInformation._childSerializers$_anonymous_$0();
            case 7:
                return ManufacturerItemInformation._childSerializers$_anonymous_$1();
            case 8:
                return StoreInformation._childSerializers$_anonymous_();
            case 9:
                return StoreInformation._childSerializers$_anonymous_$0();
            case 10:
                return BrazeLocation.forJsonPut$lambda$1();
            case 11:
                return BrazeProperties.addProperty$lambda$1();
            case 12:
                return BrazeProperties.clone$lambda$2();
            case 13:
                return BrazeProperties.get$lambda$3();
            case 14:
                return d.a();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return d.b();
            case 16:
                return h.c();
            case 17:
                return Resources.getSystem().getDisplayMetrics();
            case 18:
                return Author._childSerializers$_anonymous_();
            case 19:
                return Author._childSerializers$_anonymous_$0();
            case 20:
                return AuthorSubtype._init_$_anonymous_();
            case 21:
                return AuthorType._init_$_anonymous_();
            case 22:
                return Conversation._childSerializers$_anonymous_();
            case 23:
                return Conversation._childSerializers$_anonymous_$0();
            case 24:
                return Conversation._childSerializers$_anonymous_$1();
            case 25:
                return Conversation._childSerializers$_anonymous_$2();
            case 26:
                return Conversation._childSerializers$_anonymous_$3();
            case 27:
                return Conversation._childSerializers$_anonymous_$4();
            case 28:
                return Conversation._childSerializers$_anonymous_$5();
            default:
                return Conversation._childSerializers$_anonymous_$6();
        }
    }
}
