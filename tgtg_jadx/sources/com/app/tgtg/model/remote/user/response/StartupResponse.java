package com.app.tgtg.model.remote.user.response;

import com.app.tgtg.model.remote.AppSettings;
import com.app.tgtg.model.remote.AppSettings$$serializer;
import com.app.tgtg.model.remote.PushNotificationsSettings;
import com.app.tgtg.model.remote.PushNotificationsSettings$$serializer;
import com.app.tgtg.model.remote.UserData;
import com.app.tgtg.model.remote.UserData$$serializer;
import com.app.tgtg.model.remote.UserSettings;
import com.app.tgtg.model.remote.UserSettings$$serializer;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.brief.BriefOrder$$serializer;
import i90.g;
import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import uu.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002XWBe\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bm\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#Jp\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u00108\u0012\u0004\b<\u0010=\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u0010;R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010>\u0012\u0004\bB\u0010=\u001a\u0004\b?\u0010\u001a\"\u0004\b@\u0010AR*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010C\u0012\u0004\bG\u0010=\u001a\u0004\bD\u0010\u001c\"\u0004\bE\u0010FR*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010H\u0012\u0004\bL\u0010=\u001a\u0004\bI\u0010\u001e\"\u0004\bJ\u0010KR0\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u0010M\u0012\u0004\bQ\u0010=\u001a\u0004\bN\u0010 \"\u0004\bO\u0010PR(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010M\u0012\u0004\bS\u0010=\u001a\u0004\bR\u0010 R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010T\u0012\u0004\bV\u0010=\u001a\u0004\bU\u0010#¨\u0006Y"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/StartupResponse;", "", "Lcom/app/tgtg/model/remote/AppSettings;", "appSettings", "Lcom/app/tgtg/model/remote/user/response/ListOrders;", "orders", "Lcom/app/tgtg/model/remote/UserData;", "user", "Lcom/app/tgtg/model/remote/UserSettings;", "userSettings", "", "Lcom/app/tgtg/model/remote/brief/BriefOrder;", "briefOrders", "receivedOrders", "Lcom/app/tgtg/model/remote/PushNotificationsSettings;", "pushNotificationsSettings", "<init>", "(Lcom/app/tgtg/model/remote/AppSettings;Lcom/app/tgtg/model/remote/user/response/ListOrders;Lcom/app/tgtg/model/remote/UserData;Lcom/app/tgtg/model/remote/UserSettings;Ljava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/PushNotificationsSettings;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/AppSettings;Lcom/app/tgtg/model/remote/user/response/ListOrders;Lcom/app/tgtg/model/remote/UserData;Lcom/app/tgtg/model/remote/UserSettings;Ljava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/PushNotificationsSettings;Lm90/m1;)V", "component1", "()Lcom/app/tgtg/model/remote/AppSettings;", "component2", "()Lcom/app/tgtg/model/remote/user/response/ListOrders;", "component3", "()Lcom/app/tgtg/model/remote/UserData;", "component4", "()Lcom/app/tgtg/model/remote/UserSettings;", "component5", "()Ljava/util/List;", "component6", "component7", "()Lcom/app/tgtg/model/remote/PushNotificationsSettings;", "copy", "(Lcom/app/tgtg/model/remote/AppSettings;Lcom/app/tgtg/model/remote/user/response/ListOrders;Lcom/app/tgtg/model/remote/UserData;Lcom/app/tgtg/model/remote/UserSettings;Ljava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/PushNotificationsSettings;)Lcom/app/tgtg/model/remote/user/response/StartupResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/StartupResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/app/tgtg/model/remote/AppSettings;", "getAppSettings", "setAppSettings", "(Lcom/app/tgtg/model/remote/AppSettings;)V", "getAppSettings$annotations", "()V", "Lcom/app/tgtg/model/remote/user/response/ListOrders;", "getOrders", "setOrders", "(Lcom/app/tgtg/model/remote/user/response/ListOrders;)V", "getOrders$annotations", "Lcom/app/tgtg/model/remote/UserData;", "getUser", "setUser", "(Lcom/app/tgtg/model/remote/UserData;)V", "getUser$annotations", "Lcom/app/tgtg/model/remote/UserSettings;", "getUserSettings", "setUserSettings", "(Lcom/app/tgtg/model/remote/UserSettings;)V", "getUserSettings$annotations", "Ljava/util/List;", "getBriefOrders", "setBriefOrders", "(Ljava/util/List;)V", "getBriefOrders$annotations", "getReceivedOrders", "getReceivedOrders$annotations", "Lcom/app/tgtg/model/remote/PushNotificationsSettings;", "getPushNotificationsSettings", "getPushNotificationsSettings$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class StartupResponse {

    @NotNull
    private static final j[] $childSerializers;

    @Nullable
    private AppSettings appSettings;

    @Nullable
    private List<BriefOrder> briefOrders;

    @Nullable
    private ListOrders orders;

    @Nullable
    private final PushNotificationsSettings pushNotificationsSettings;

    @Nullable
    private final List<BriefOrder> receivedOrders;

    @Nullable
    private UserData user;

    @Nullable
    private UserSettings userSettings;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, null, null, l.a(mVar, new a(18)), l.a(mVar, new a(19)), null};
    }

    public /* synthetic */ StartupResponse(int i11, AppSettings appSettings, ListOrders listOrders, UserData userData, UserSettings userSettings, List list, List list2, PushNotificationsSettings pushNotificationsSettings, m1 m1Var) {
        if (32 != (i11 & 32)) {
            c1.j(i11, 32, StartupResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.appSettings = null;
        } else {
            this.appSettings = appSettings;
        }
        if ((i11 & 2) == 0) {
            this.orders = null;
        } else {
            this.orders = listOrders;
        }
        if ((i11 & 4) == 0) {
            this.user = null;
        } else {
            this.user = userData;
        }
        if ((i11 & 8) == 0) {
            this.userSettings = null;
        } else {
            this.userSettings = userSettings;
        }
        if ((i11 & 16) == 0) {
            this.briefOrders = null;
        } else {
            this.briefOrders = list;
        }
        this.receivedOrders = list2;
        if ((i11 & 64) == 0) {
            this.pushNotificationsSettings = null;
        } else {
            this.pushNotificationsSettings = pushNotificationsSettings;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(BriefOrder$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(BriefOrder$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StartupResponse copy$default(StartupResponse startupResponse, AppSettings appSettings, ListOrders listOrders, UserData userData, UserSettings userSettings, List list, List list2, PushNotificationsSettings pushNotificationsSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            appSettings = startupResponse.appSettings;
        }
        if ((i11 & 2) != 0) {
            listOrders = startupResponse.orders;
        }
        if ((i11 & 4) != 0) {
            userData = startupResponse.user;
        }
        if ((i11 & 8) != 0) {
            userSettings = startupResponse.userSettings;
        }
        if ((i11 & 16) != 0) {
            list = startupResponse.briefOrders;
        }
        if ((i11 & 32) != 0) {
            list2 = startupResponse.receivedOrders;
        }
        if ((i11 & 64) != 0) {
            pushNotificationsSettings = startupResponse.pushNotificationsSettings;
        }
        List list3 = list2;
        PushNotificationsSettings pushNotificationsSettings2 = pushNotificationsSettings;
        List list4 = list;
        UserData userData2 = userData;
        return startupResponse.copy(appSettings, listOrders, userData2, userSettings, list4, list3, pushNotificationsSettings2);
    }

    public static final /* synthetic */ void write$Self$app(StartupResponse self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.appSettings != null) {
            output.r(serialDesc, 0, AppSettings$$serializer.INSTANCE, self.appSettings);
        }
        if (output.C(serialDesc) || self.orders != null) {
            output.r(serialDesc, 1, ListOrders$$serializer.INSTANCE, self.orders);
        }
        if (output.C(serialDesc) || self.user != null) {
            output.r(serialDesc, 2, UserData$$serializer.INSTANCE, self.user);
        }
        if (output.C(serialDesc) || self.userSettings != null) {
            output.r(serialDesc, 3, UserSettings$$serializer.INSTANCE, self.userSettings);
        }
        if (output.C(serialDesc) || self.briefOrders != null) {
            output.r(serialDesc, 4, (KSerializer) jVarArr[4].getValue(), self.briefOrders);
        }
        output.r(serialDesc, 5, (KSerializer) jVarArr[5].getValue(), self.receivedOrders);
        if (!output.C(serialDesc) && self.pushNotificationsSettings == null) {
            return;
        }
        output.r(serialDesc, 6, PushNotificationsSettings$$serializer.INSTANCE, self.pushNotificationsSettings);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AppSettings getAppSettings() {
        return this.appSettings;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ListOrders getOrders() {
        return this.orders;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UserData getUser() {
        return this.user;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UserSettings getUserSettings() {
        return this.userSettings;
    }

    @Nullable
    public final List<BriefOrder> component5() {
        return this.briefOrders;
    }

    @Nullable
    public final List<BriefOrder> component6() {
        return this.receivedOrders;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PushNotificationsSettings getPushNotificationsSettings() {
        return this.pushNotificationsSettings;
    }

    @NotNull
    public final StartupResponse copy(@Nullable AppSettings appSettings, @Nullable ListOrders orders, @Nullable UserData user, @Nullable UserSettings userSettings, @Nullable List<BriefOrder> briefOrders, @Nullable List<BriefOrder> receivedOrders, @Nullable PushNotificationsSettings pushNotificationsSettings) {
        return new StartupResponse(appSettings, orders, user, userSettings, briefOrders, receivedOrders, pushNotificationsSettings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartupResponse)) {
            return false;
        }
        StartupResponse startupResponse = (StartupResponse) other;
        return Intrinsics.areEqual(this.appSettings, startupResponse.appSettings) && Intrinsics.areEqual(this.orders, startupResponse.orders) && Intrinsics.areEqual(this.user, startupResponse.user) && Intrinsics.areEqual(this.userSettings, startupResponse.userSettings) && Intrinsics.areEqual(this.briefOrders, startupResponse.briefOrders) && Intrinsics.areEqual(this.receivedOrders, startupResponse.receivedOrders) && Intrinsics.areEqual(this.pushNotificationsSettings, startupResponse.pushNotificationsSettings);
    }

    @Nullable
    public final AppSettings getAppSettings() {
        return this.appSettings;
    }

    @Nullable
    public final List<BriefOrder> getBriefOrders() {
        return this.briefOrders;
    }

    @Nullable
    public final ListOrders getOrders() {
        return this.orders;
    }

    @Nullable
    public final PushNotificationsSettings getPushNotificationsSettings() {
        return this.pushNotificationsSettings;
    }

    @Nullable
    public final List<BriefOrder> getReceivedOrders() {
        return this.receivedOrders;
    }

    @Nullable
    public final UserData getUser() {
        return this.user;
    }

    @Nullable
    public final UserSettings getUserSettings() {
        return this.userSettings;
    }

    public int hashCode() {
        AppSettings appSettings = this.appSettings;
        int iHashCode = (appSettings == null ? 0 : appSettings.hashCode()) * 31;
        ListOrders listOrders = this.orders;
        int iHashCode2 = (iHashCode + (listOrders == null ? 0 : listOrders.hashCode())) * 31;
        UserData userData = this.user;
        int iHashCode3 = (iHashCode2 + (userData == null ? 0 : userData.hashCode())) * 31;
        UserSettings userSettings = this.userSettings;
        int iHashCode4 = (iHashCode3 + (userSettings == null ? 0 : userSettings.hashCode())) * 31;
        List<BriefOrder> list = this.briefOrders;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<BriefOrder> list2 = this.receivedOrders;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        PushNotificationsSettings pushNotificationsSettings = this.pushNotificationsSettings;
        return iHashCode6 + (pushNotificationsSettings != null ? pushNotificationsSettings.hashCode() : 0);
    }

    public final void setAppSettings(@Nullable AppSettings appSettings) {
        this.appSettings = appSettings;
    }

    public final void setBriefOrders(@Nullable List<BriefOrder> list) {
        this.briefOrders = list;
    }

    public final void setOrders(@Nullable ListOrders listOrders) {
        this.orders = listOrders;
    }

    public final void setUser(@Nullable UserData userData) {
        this.user = userData;
    }

    public final void setUserSettings(@Nullable UserSettings userSettings) {
        this.userSettings = userSettings;
    }

    @NotNull
    public String toString() {
        return "StartupResponse(appSettings=" + this.appSettings + ", orders=" + this.orders + ", user=" + this.user + ", userSettings=" + this.userSettings + ", briefOrders=" + this.briefOrders + ", receivedOrders=" + this.receivedOrders + ", pushNotificationsSettings=" + this.pushNotificationsSettings + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/StartupResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/StartupResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StartupResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("app_settings")
    public static /* synthetic */ void getAppSettings$annotations() {
    }

    @g("brief_orders")
    public static /* synthetic */ void getBriefOrders$annotations() {
    }

    @g("orders")
    public static /* synthetic */ void getOrders$annotations() {
    }

    @g("user_push_notification_settings")
    public static /* synthetic */ void getPushNotificationsSettings$annotations() {
    }

    @g("received_orders")
    public static /* synthetic */ void getReceivedOrders$annotations() {
    }

    @g("user")
    public static /* synthetic */ void getUser$annotations() {
    }

    @g("user_settings")
    public static /* synthetic */ void getUserSettings$annotations() {
    }

    public StartupResponse(@Nullable AppSettings appSettings, @Nullable ListOrders listOrders, @Nullable UserData userData, @Nullable UserSettings userSettings, @Nullable List<BriefOrder> list, @Nullable List<BriefOrder> list2, @Nullable PushNotificationsSettings pushNotificationsSettings) {
        this.appSettings = appSettings;
        this.orders = listOrders;
        this.user = userData;
        this.userSettings = userSettings;
        this.briefOrders = list;
        this.receivedOrders = list2;
        this.pushNotificationsSettings = pushNotificationsSettings;
    }

    public /* synthetic */ StartupResponse(AppSettings appSettings, ListOrders listOrders, UserData userData, UserSettings userSettings, List list, List list2, PushNotificationsSettings pushNotificationsSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : appSettings, (i11 & 2) != 0 ? null : listOrders, (i11 & 4) != 0 ? null : userData, (i11 & 8) != 0 ? null : userSettings, (i11 & 16) != 0 ? null : list, list2, (i11 & 64) != 0 ? null : pushNotificationsSettings);
    }
}
