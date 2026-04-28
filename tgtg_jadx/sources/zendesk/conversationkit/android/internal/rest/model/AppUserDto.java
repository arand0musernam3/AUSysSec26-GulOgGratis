package zendesk.conversationkit.android.internal.rest.model;

import au.a;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.f0;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0081\b\u0018\u0000 E2\u00020\u0001:\u0002FEB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0097\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b!\u0010 J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0098\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000eHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u0010\u0010'\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b:\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b;\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b<\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b=\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b>\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b?\u0010\u0018R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010 R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bB\u0010 R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010#¨\u0006G"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/AppUserDto;", "", "", "id", "userId", "givenName", "surname", "email", "locale", "signedUpAt", "", "Lzendesk/conversationkit/android/internal/rest/model/ClientDto;", "clients", "pendingClients", "", "properties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lm90/m1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "component10", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Lzendesk/conversationkit/android/internal/rest/model/AppUserDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/AppUserDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getUserId", "getGivenName", "getSurname", "getEmail", "getLocale", "getSignedUpAt", "Ljava/util/List;", "getClients", "getPendingClients", "Ljava/util/Map;", "getProperties", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AppUserDto {

    @NotNull
    private static final j[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<ClientDto> clients;

    @Nullable
    private final String email;

    @Nullable
    private final String givenName;

    @NotNull
    private final String id;

    @Nullable
    private final String locale;

    @NotNull
    private final List<ClientDto> pendingClients;

    @NotNull
    private final Map<String, Object> properties;

    @Nullable
    private final String signedUpAt;

    @Nullable
    private final String surname;

    @Nullable
    private final String userId;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, null, null, null, null, null, l.a(mVar, new a(15)), l.a(mVar, new a(16)), l.a(mVar, new a(17))};
    }

    public /* synthetic */ AppUserDto(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, Map map, m1 m1Var) {
        if (1023 != (i11 & 1023)) {
            c1.j(i11, 1023, AppUserDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.userId = str2;
        this.givenName = str3;
        this.surname = str4;
        this.email = str5;
        this.locale = str6;
        this.signedUpAt = str7;
        this.clients = list;
        this.pendingClients = list2;
        this.properties = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ClientDto$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(ClientDto$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new f0(r1.f29848a, new i90.a(Reflection.getOrCreateKotlinClass(Object.class), new KSerializer[0]), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppUserDto copy$default(AppUserDto appUserDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = appUserDto.id;
        }
        if ((i11 & 2) != 0) {
            str2 = appUserDto.userId;
        }
        if ((i11 & 4) != 0) {
            str3 = appUserDto.givenName;
        }
        if ((i11 & 8) != 0) {
            str4 = appUserDto.surname;
        }
        if ((i11 & 16) != 0) {
            str5 = appUserDto.email;
        }
        if ((i11 & 32) != 0) {
            str6 = appUserDto.locale;
        }
        if ((i11 & 64) != 0) {
            str7 = appUserDto.signedUpAt;
        }
        if ((i11 & 128) != 0) {
            list = appUserDto.clients;
        }
        if ((i11 & 256) != 0) {
            list2 = appUserDto.pendingClients;
        }
        if ((i11 & 512) != 0) {
            map = appUserDto.properties;
        }
        List list3 = list2;
        Map map2 = map;
        String str8 = str7;
        List list4 = list;
        String str9 = str5;
        String str10 = str6;
        return appUserDto.copy(str, str2, str3, str4, str9, str10, str8, list4, list3, map2);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(AppUserDto self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.id);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 1, r1Var, self.userId);
        output.r(serialDesc, 2, r1Var, self.givenName);
        output.r(serialDesc, 3, r1Var, self.surname);
        output.r(serialDesc, 4, r1Var, self.email);
        output.r(serialDesc, 5, r1Var, self.locale);
        output.r(serialDesc, 6, r1Var, self.signedUpAt);
        output.i(serialDesc, 7, (KSerializer) jVarArr[7].getValue(), self.clients);
        output.i(serialDesc, 8, (KSerializer) jVarArr[8].getValue(), self.pendingClients);
        output.i(serialDesc, 9, (KSerializer) jVarArr[9].getValue(), self.properties);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Map<String, Object> component10() {
        return this.properties;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGivenName() {
        return this.givenName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSignedUpAt() {
        return this.signedUpAt;
    }

    @NotNull
    public final List<ClientDto> component8() {
        return this.clients;
    }

    @NotNull
    public final List<ClientDto> component9() {
        return this.pendingClients;
    }

    @NotNull
    public final AppUserDto copy(@NotNull String id2, @Nullable String userId, @Nullable String givenName, @Nullable String surname, @Nullable String email, @Nullable String locale, @Nullable String signedUpAt, @NotNull List<ClientDto> clients, @NotNull List<ClientDto> pendingClients, @NotNull Map<String, ? extends Object> properties) {
        id2.getClass();
        clients.getClass();
        pendingClients.getClass();
        properties.getClass();
        return new AppUserDto(id2, userId, givenName, surname, email, locale, signedUpAt, clients, pendingClients, properties);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppUserDto)) {
            return false;
        }
        AppUserDto appUserDto = (AppUserDto) other;
        return Intrinsics.areEqual(this.id, appUserDto.id) && Intrinsics.areEqual(this.userId, appUserDto.userId) && Intrinsics.areEqual(this.givenName, appUserDto.givenName) && Intrinsics.areEqual(this.surname, appUserDto.surname) && Intrinsics.areEqual(this.email, appUserDto.email) && Intrinsics.areEqual(this.locale, appUserDto.locale) && Intrinsics.areEqual(this.signedUpAt, appUserDto.signedUpAt) && Intrinsics.areEqual(this.clients, appUserDto.clients) && Intrinsics.areEqual(this.pendingClients, appUserDto.pendingClients) && Intrinsics.areEqual(this.properties, appUserDto.properties);
    }

    @NotNull
    public final List<ClientDto> getClients() {
        return this.clients;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getGivenName() {
        return this.givenName;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    public final List<ClientDto> getPendingClients() {
        return this.pendingClients;
    }

    @NotNull
    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    @Nullable
    public final String getSignedUpAt() {
        return this.signedUpAt;
    }

    @Nullable
    public final String getSurname() {
        return this.surname;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.userId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.givenName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.surname;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.locale;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.signedUpAt;
        return this.properties.hashCode() + f.c(this.pendingClients, f.c(this.clients, (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.userId;
        String str3 = this.givenName;
        String str4 = this.surname;
        String str5 = this.email;
        String str6 = this.locale;
        String str7 = this.signedUpAt;
        List<ClientDto> list = this.clients;
        List<ClientDto> list2 = this.pendingClients;
        Map<String, Object> map = this.properties;
        StringBuilder sbT = f.t("AppUserDto(id=", str, ", userId=", str2, ", givenName=");
        s.A(sbT, str3, ", surname=", str4, ", email=");
        s.A(sbT, str5, ", locale=", str6, ", signedUpAt=");
        sbT.append(str7);
        sbT.append(", clients=");
        sbT.append(list);
        sbT.append(", pendingClients=");
        sbT.append(list2);
        sbT.append(", properties=");
        sbT.append(map);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/AppUserDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/AppUserDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return AppUserDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("_id")
    public static /* synthetic */ void getId$annotations() {
    }

    public AppUserDto(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull List<ClientDto> list, @NotNull List<ClientDto> list2, @NotNull Map<String, ? extends Object> map) {
        str.getClass();
        list.getClass();
        list2.getClass();
        map.getClass();
        this.id = str;
        this.userId = str2;
        this.givenName = str3;
        this.surname = str4;
        this.email = str5;
        this.locale = str6;
        this.signedUpAt = str7;
        this.clients = list;
        this.pendingClients = list2;
        this.properties = map;
    }
}
