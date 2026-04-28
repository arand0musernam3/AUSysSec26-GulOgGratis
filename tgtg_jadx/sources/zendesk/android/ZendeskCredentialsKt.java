package zendesk.android;

import android.os.Build;
import ia0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import n90.c;
import n90.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r40.d;
import y9.w;
import yj.m;
import zendesk.android.internal.ChannelKeyFields;
import zendesk.android.internal.ChannelKeyFieldsKt;
import zendesk.android.internal.ZendeskError;
import zendesk.android.internal.di.ZendeskComponentConfig;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzendesk/android/ZendeskCredentials;", "Ln90/c;", "json", "Lzendesk/android/internal/ChannelKeyFields;", "toChannelKeyFields", "(Lzendesk/android/ZendeskCredentials;Ln90/c;)Lzendesk/android/internal/ChannelKeyFields;", "Lzendesk/android/internal/di/ZendeskComponentConfig;", "getZendeskComponentConfig", "(Lzendesk/android/ZendeskCredentials;)Lzendesk/android/internal/di/ZendeskComponentConfig;", "zendesk_zendesk-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nZendeskCredentials.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZendeskCredentials.kt\nzendesk/android/ZendeskCredentialsKt\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,150:1\n222#2:151\n*S KotlinDebug\n*F\n+ 1 ZendeskCredentials.kt\nzendesk/android/ZendeskCredentialsKt\n*L\n124#1:151\n*E\n"})
public final class ZendeskCredentialsKt {
    @NotNull
    public static final ZendeskComponentConfig getZendeskComponentConfig(@NotNull ZendeskCredentials zendeskCredentials) throws ZendeskError.InvalidChannelKey {
        zendeskCredentials.getClass();
        ChannelKeyFields channelKeyFields = toChannelKeyFields(zendeskCredentials, w.h(new m(16)));
        if (channelKeyFields == null) {
            throw ZendeskError.InvalidChannelKey.INSTANCE;
        }
        String baseUrl = ChannelKeyFieldsKt.getBaseUrl(channelKeyFields);
        String str = Build.VERSION.RELEASE;
        if (str == null) {
            str = "";
        }
        return new ZendeskComponentConfig(zendeskCredentials, baseUrl, zendesk.conversationkit.android.BuildConfig.VERSION_NAME, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getZendeskComponentConfig$lambda$0(h hVar) {
        hVar.getClass();
        hVar.f30766c = true;
        return Unit.f26487a;
    }

    @Nullable
    public static final ChannelKeyFields toChannelKeyFields(@NotNull ZendeskCredentials zendeskCredentials, @NotNull c cVar) {
        zendeskCredentials.getClass();
        cVar.getClass();
        try {
            j jVar = j.f23646d;
            j jVarM = d.m(zendeskCredentials.getChannelKey());
            if (jVarM == null) {
                throw ZendeskError.InvalidChannelKey.INSTANCE;
            }
            return (ChannelKeyFields) cVar.b(ChannelKeyFields.INSTANCE.serializer(), jVarM.s());
        } catch (Throwable unused) {
            return null;
        }
    }
}
