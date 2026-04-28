package yj;

import android.content.Context;
import c5.v0;
import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m3.d3;
import org.bouncycastle.iana.AEADAlgorithm;
import s1.e0;
import s1.r0;
import s1.s;
import s1.x0;
import s1.y0;
import w4.d0;
import z1.t;
import z1.u;
import z1.w;
import zendesk.analyticskit.android.internal.storage.AnalyticsStorage;
import zendesk.android.ZendeskCredentialsKt;
import zendesk.android.internal.network.NetworkModule;
import zendesk.android.internal.storage.ZendeskStorageSerializer;
import zendesk.conversationkit.android.internal.EffectMapper;
import zendesk.conversationkit.android.internal.user.Jwt;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.core.android.internal.di.KotlinxSerializationModule;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenRendering;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46104a;

    public /* synthetic */ m(int i11) {
        this.f46104a = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = 2;
        int i12 = 0;
        int i13 = 1;
        switch (this.f46104a) {
            case 0:
                BasicItem basicItem = (BasicItem) obj;
                basicItem.getClass();
                return basicItem.getInformation().mo340getItemIdFvU5WIY();
            case 1:
                s sVar = (s) obj;
                sVar.getClass();
                if (sVar.c() != yk.j.SELECT_AREA) {
                    x0 x0VarA = r0.l(1, new k9.f(i13)).a(r0.d(null, 3));
                    y0 y0VarE = r0.e(null, 3);
                    int i14 = s1.i.f38614b;
                    return new e0(x0VarA, y0VarE);
                }
                x0 x0VarA2 = r0.l(1, new m(i11)).a(r0.d(null, 3));
                y0 y0VarE2 = r0.e(null, 3);
                int i15 = s1.i.f38614b;
                return new e0(x0VarA2, y0VarE2);
            case 2:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 3:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 4:
                return Boolean.TRUE;
            case 5:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 6:
                return Boolean.TRUE;
            case 7:
                u3.i iVar = (u3.i) obj;
                d3 d3Var = v0.f7390b;
                iVar.getClass();
                if (((Context) m3.i.y(iVar, d3Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return w.f46736b;
                }
                u.f46707a.getClass();
                return t.f46687c;
            case 8:
                return Boolean.TRUE;
            case 9:
                ((Long) obj).longValue();
                return Unit.f26487a;
            case 10:
                d0 d0Var = (d0) obj;
                if (d0Var != null && d0Var.f43116a == 2) {
                    i12 = 1;
                }
                return Boolean.valueOf(i12 ^ 1);
            case 11:
                ((Float) obj).floatValue();
                return Unit.f26487a;
            case 12:
                synchronized (z3.l.f47038c) {
                    ?? r12 = z3.l.f47044i;
                    int size = r12.size();
                    while (i12 < size) {
                        ((Function1) r12.get(i12)).invoke(obj);
                        i12++;
                    }
                }
                return Unit.f26487a;
            case 13:
                return Unit.f26487a;
            case 14:
                return ZendeskStorageSerializer._init_$lambda$0((n90.h) obj);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return AnalyticsStorage._init_$lambda$0((n90.h) obj);
            case 16:
                return ZendeskCredentialsKt.getZendeskComponentConfig$lambda$0((n90.h) obj);
            case 17:
                return NetworkModule.provideJson$lambda$1((n90.h) obj);
            case 18:
                return EffectMapper.mapMessagePrepared$lambda$28$lambda$27((Conversation) obj);
            case 19:
                return EffectMapper.mapActivityEvent$lambda$39$lambda$38((Conversation) obj);
            case 20:
                return EffectMapper.mapLoadMoreMessages$lambda$26$lambda$25((Conversation) obj);
            case 21:
                return EffectMapper.mapSendMessageResult$lambda$32$lambda$31((Conversation) obj);
            case 22:
                return EffectMapper.mapMessageReceived$lambda$23$lambda$21((Conversation) obj);
            case 23:
                return EffectMapper.mapAttachmentDownloadStarted$lambda$55$lambda$54((Conversation) obj);
            case 24:
                return Jwt.Decoder.json$lambda$0((n90.h) obj);
            case 25:
                return KotlinxSerializationModule.provideJson$lambda$1((n90.h) obj);
            case 26:
                return ConversationScreenCoordinator.onRetryConnectionClicked$lambda$10((ConversationScreenViewModel) obj);
            case 27:
                return ConversationScreenCoordinator.onFormFocusChanged$lambda$15((ConversationScreenViewModel) obj);
            case 28:
                return ConversationScreenRendering.Builder.onFormFocusChanged$lambda$0(((Boolean) obj).booleanValue());
            default:
                return ConversationScreenRendering.Builder.onLoadMoreMessages$lambda$9(((Double) obj).doubleValue());
        }
    }
}
