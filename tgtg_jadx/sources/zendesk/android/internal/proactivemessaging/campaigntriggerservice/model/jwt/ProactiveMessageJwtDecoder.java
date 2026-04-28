package zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.jwt;

import ia0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.SerializationException;
import n90.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r40.d;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\r"}, d2 = {"Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessageJwtDecoder;", "", "Ln90/c;", "json", "<init>", "(Ln90/c;)V", "", "jwt", "Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessageResponse;", "decode", "(Ljava/lang/String;)Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessageResponse;", "Ln90/c;", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProactiveMessageJwtDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProactiveMessageJwtDecoder.kt\nzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessageJwtDecoder\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,25:1\n222#2:26\n*S KotlinDebug\n*F\n+ 1 ProactiveMessageJwtDecoder.kt\nzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessageJwtDecoder\n*L\n14#1:26\n*E\n"})
public final class ProactiveMessageJwtDecoder {

    @NotNull
    private static final String LOG_TAG = "ProactiveMessageJwtDecoder";

    @NotNull
    private final c json;

    public ProactiveMessageJwtDecoder(@NotNull c cVar) {
        cVar.getClass();
        this.json = cVar;
    }

    @Nullable
    public final ProactiveMessageResponse decode(@NotNull String jwt) {
        jwt.getClass();
        String str = (String) StringsKt.S(jwt, new char[]{'.'}, 6).get(1);
        j jVar = j.f23646d;
        j jVarM = d.m(str);
        String strO = jVarM != null ? jVarM.o(Charsets.UTF_8) : null;
        if (strO == null) {
            strO = "";
        }
        try {
            c cVar = this.json;
            cVar.getClass();
            return (ProactiveMessageResponse) cVar.b(ProactiveMessageResponse.INSTANCE.serializer(), strO);
        } catch (SerializationException e5) {
            Logger.e(LOG_TAG, e5.getMessage(), new Object[0]);
            return null;
        }
    }
}
