package zendesk.conversationkit.android.internal.user;

import i90.g;
import i90.h;
import ia0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.q0;
import n90.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r40.d;
import y9.w;
import yj.m;
import zendesk.conversationkit.android.ConversationKitResult;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0001\u000e¨\u0006\u000f"}, d2 = {"Lzendesk/conversationkit/android/internal/user/Jwt;", "", "<init>", "()V", "externalId", "", "getExternalId", "()Ljava/lang/String;", "exp", "", "getExp", "()Ljava/lang/Long;", "Unified", "Decoder", "Lzendesk/conversationkit/android/internal/user/Jwt$Unified;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Jwt {
    public /* synthetic */ Jwt(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public abstract Long getExp();

    @NotNull
    public abstract String getExternalId();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lzendesk/conversationkit/android/internal/user/Jwt$Unified;", "Lzendesk/conversationkit/android/internal/user/Jwt;", "", "externalId", "", "exp", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Long;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/user/Jwt$Unified;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getExternalId", "()Ljava/lang/String;", "getExternalId$annotations", "()V", "Ljava/lang/Long;", "getExp", "()Ljava/lang/Long;", "getExp$annotations", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    public static final class Unified extends Jwt {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Long exp;

        @NotNull
        private final String externalId;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Unified(int i11, String str, Long l, m1 m1Var) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (3 != (i11 & 3)) {
                c1.j(i11, 3, Jwt$Unified$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            super(defaultConstructorMarker);
            this.externalId = str;
            this.exp = l;
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Unified self, b output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.getExternalId());
            output.r(serialDesc, 1, q0.f29842a, self.getExp());
        }

        @Override // zendesk.conversationkit.android.internal.user.Jwt
        @Nullable
        public Long getExp() {
            return this.exp;
        }

        @Override // zendesk.conversationkit.android.internal.user.Jwt
        @NotNull
        public String getExternalId() {
            return this.externalId;
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/user/Jwt$Unified$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/user/Jwt$Unified;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return Jwt$Unified$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @g("exp")
        public static /* synthetic */ void getExp$annotations() {
        }

        @g("external_id")
        public static /* synthetic */ void getExternalId$annotations() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unified(@NotNull String str, @Nullable Long l) {
            super(null);
            str.getClass();
            this.externalId = str;
            this.exp = l;
        }
    }

    private Jwt() {
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u0003¨\u0006\u000e"}, d2 = {"Lzendesk/conversationkit/android/internal/user/Jwt$Decoder;", "", "<init>", "()V", "", "jwt", "Lzendesk/conversationkit/android/ConversationKitResult;", "Lzendesk/conversationkit/android/internal/user/Jwt;", "decode", "(Ljava/lang/String;)Lzendesk/conversationkit/android/ConversationKitResult;", "Ln90/c;", "json", "Ln90/c;", "getJson$annotations", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nJwt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Jwt.kt\nzendesk/conversationkit/android/internal/user/Jwt$Decoder\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,48:1\n222#2:49\n*S KotlinDebug\n*F\n+ 1 Jwt.kt\nzendesk/conversationkit/android/internal/user/Jwt$Decoder\n*L\n41#1:49\n*E\n"})
    public static final class Decoder {

        @NotNull
        private final c json = w.h(new m(24));

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit json$lambda$0(n90.h hVar) {
            hVar.getClass();
            hVar.f30764a = true;
            hVar.f30766c = true;
            hVar.f30765b = false;
            hVar.f30767d = true;
            return Unit.f26487a;
        }

        @NotNull
        public final ConversationKitResult<Jwt> decode(@NotNull String jwt) {
            jwt.getClass();
            try {
                String str = (String) StringsKt.S(jwt, new char[]{'.'}, 6).get(1);
                j jVar = j.f23646d;
                j jVarM = d.m(str);
                String strO = jVarM != null ? jVarM.o(Charsets.UTF_8) : null;
                if (strO == null) {
                    strO = "";
                }
                c cVar = this.json;
                cVar.getClass();
                return new ConversationKitResult.Success((Unified) cVar.b(Unified.INSTANCE.serializer(), strO));
            } catch (Exception e5) {
                return new ConversationKitResult.Failure(e5);
            }
        }

        private static /* synthetic */ void getJson$annotations() {
        }
    }
}
