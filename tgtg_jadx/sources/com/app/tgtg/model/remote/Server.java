package com.app.tgtg.model.remote;

import b3.i;
import e0.f;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.l0;
import m90.m1;
import n90.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000278B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JD\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010\u001aR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b4\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\"¨\u00069"}, d2 = {"Lcom/app/tgtg/model/remote/Server;", "", "", "name", "domain", "", "production", "https", "", "port", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Integer;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZZLjava/lang/Integer;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/Server;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "getUrl", "()Ljava/lang/String;", "toJson", "component1", "component2", "component3", "()Z", "component4", "component5", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Integer;)Lcom/app/tgtg/model/remote/Server;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getDomain", "getDomain$annotations", "Z", "getProduction", "getProduction$annotations", "getHttps", "Ljava/lang/Integer;", "getPort", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Server {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String PROD_DOMAIN = "api.toogoodtogo.com";

    @NotNull
    private final String domain;
    private final boolean https;

    @NotNull
    private final String name;

    @Nullable
    private final Integer port;
    private final boolean production;

    public /* synthetic */ Server(int i11, String str, String str2, boolean z11, boolean z12, Integer num, m1 m1Var) {
        this.name = (i11 & 1) == 0 ? "Prod (nearest)" : str;
        if ((i11 & 2) == 0) {
            this.domain = PROD_DOMAIN;
        } else {
            this.domain = str2;
        }
        if ((i11 & 4) == 0) {
            this.production = true;
        } else {
            this.production = z11;
        }
        if ((i11 & 8) == 0) {
            this.https = true;
        } else {
            this.https = z12;
        }
        if ((i11 & 16) == 0) {
            this.port = null;
        } else {
            this.port = num;
        }
    }

    public static /* synthetic */ Server copy$default(Server server, String str, String str2, boolean z11, boolean z12, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = server.name;
        }
        if ((i11 & 2) != 0) {
            str2 = server.domain;
        }
        if ((i11 & 4) != 0) {
            z11 = server.production;
        }
        if ((i11 & 8) != 0) {
            z12 = server.https;
        }
        if ((i11 & 16) != 0) {
            num = server.port;
        }
        Integer num2 = num;
        boolean z13 = z11;
        return server.copy(str, str2, z13, z12, num2);
    }

    public static final /* synthetic */ void write$Self$app(Server self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.name, "Prod (nearest)")) {
            output.q(serialDesc, 0, self.name);
        }
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.domain, PROD_DOMAIN)) {
            output.q(serialDesc, 1, self.domain);
        }
        if (output.C(serialDesc) || !self.production) {
            output.p(serialDesc, 2, self.production);
        }
        if (output.C(serialDesc) || !self.https) {
            output.p(serialDesc, 3, self.https);
        }
        if (!output.C(serialDesc) && self.port == null) {
            return;
        }
        output.r(serialDesc, 4, l0.f29821a, self.port);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getProduction() {
        return this.production;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHttps() {
        return this.https;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getPort() {
        return this.port;
    }

    @NotNull
    public final Server copy(@NotNull String name, @NotNull String domain, boolean production, boolean https, @Nullable Integer port) {
        name.getClass();
        domain.getClass();
        return new Server(name, domain, production, https, port);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Server)) {
            return false;
        }
        Server server = (Server) other;
        return Intrinsics.areEqual(this.name, server.name) && Intrinsics.areEqual(this.domain, server.domain) && this.production == server.production && this.https == server.https && Intrinsics.areEqual(this.port, server.port);
    }

    @NotNull
    public final String getDomain() {
        return this.domain;
    }

    public final boolean getHttps() {
        return this.https;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getPort() {
        return this.port;
    }

    public final boolean getProduction() {
        return this.production;
    }

    @NotNull
    public final String getUrl() {
        return (this.https || this.production) ? f.k("https://", this.domain) : f.k("http://", this.domain);
    }

    public int hashCode() {
        int iE = k.e(k.e(l1.b(this.name.hashCode() * 31, 31, this.domain), 31, this.production), 31, this.https);
        Integer num = this.port;
        return iE + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public final String toJson() {
        return c.f30748d.c(INSTANCE.serializer(), this);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.domain;
        boolean z11 = this.production;
        boolean z12 = this.https;
        Integer num = this.port;
        StringBuilder sbT = f.t("Server(name=", str, ", domain=", str2, ", production=");
        i.C(sbT, z11, ", https=", z12, ", port=");
        return i.m(sbT, num, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/app/tgtg/model/remote/Server$Companion;", "", "<init>", "()V", "PROD_DOMAIN", "", "fromJson", "Lcom/app/tgtg/model/remote/Server;", "jsonString", "serializer", "Lkotlinx/serialization/KSerializer;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Server fromJson(@Nullable String jsonString) {
            if (jsonString != null) {
                return (Server) c.f30748d.b(Server.INSTANCE.serializer(), jsonString);
            }
            return null;
        }

        @NotNull
        public final KSerializer serializer() {
            return Server$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("domain")
    public static /* synthetic */ void getDomain$annotations() {
    }

    @g("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @g("production")
    public static /* synthetic */ void getProduction$annotations() {
    }

    public Server() {
        this((String) null, (String) null, false, false, (Integer) null, 31, (DefaultConstructorMarker) null);
    }

    public Server(@NotNull String str, @NotNull String str2, boolean z11, boolean z12, @Nullable Integer num) {
        str.getClass();
        str2.getClass();
        this.name = str;
        this.domain = str2;
        this.production = z11;
        this.https = z12;
        this.port = num;
    }

    public /* synthetic */ Server(String str, String str2, boolean z11, boolean z12, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "Prod (nearest)" : str, (i11 & 2) != 0 ? PROD_DOMAIN : str2, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? true : z12, (i11 & 16) != 0 ? null : num);
    }
}
