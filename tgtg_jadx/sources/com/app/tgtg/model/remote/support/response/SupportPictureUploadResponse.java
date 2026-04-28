package com.app.tgtg.model.remote.support.response;

import i90.g;
import i90.h;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.k1;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tr.e;
import u70.j;
import u70.l;
import u70.m;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R0\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0006¨\u0006("}, d2 = {"Lcom/app/tgtg/model/remote/support/response/SupportPictureUploadResponse;", "", "", "", "urls", "<init>", "([Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(I[Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/support/response/SupportPictureUploadResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()[Ljava/lang/String;", "copy", "([Ljava/lang/String;)Lcom/app/tgtg/model/remote/support/response/SupportPictureUploadResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "[Ljava/lang/String;", "getUrls", "setUrls", "getUrls$annotations", "()V", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SupportPictureUploadResponse {

    @Nullable
    private String[] urls;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {l.a(m.PUBLICATION, new e(4))};

    public /* synthetic */ SupportPictureUploadResponse(int i11, String[] strArr, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.urls = null;
        } else {
            this.urls = strArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new k1(Reflection.getOrCreateKotlinClass(String.class), r1.f29848a);
    }

    public static /* synthetic */ SupportPictureUploadResponse copy$default(SupportPictureUploadResponse supportPictureUploadResponse, String[] strArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            strArr = supportPictureUploadResponse.urls;
        }
        return supportPictureUploadResponse.copy(strArr);
    }

    public static final /* synthetic */ void write$Self$app(SupportPictureUploadResponse self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (!output.C(serialDesc) && self.urls == null) {
            return;
        }
        output.r(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.urls);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String[] getUrls() {
        return this.urls;
    }

    @NotNull
    public final SupportPictureUploadResponse copy(@Nullable String[] urls) {
        return new SupportPictureUploadResponse(urls);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SupportPictureUploadResponse) && Intrinsics.areEqual(this.urls, ((SupportPictureUploadResponse) other).urls);
    }

    @Nullable
    public final String[] getUrls() {
        return this.urls;
    }

    public int hashCode() {
        String[] strArr = this.urls;
        if (strArr == null) {
            return 0;
        }
        return Arrays.hashCode(strArr);
    }

    public final void setUrls(@Nullable String[] strArr) {
        this.urls = strArr;
    }

    @NotNull
    public String toString() {
        return a0.p("SupportPictureUploadResponse(urls=", Arrays.toString(this.urls), ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/support/response/SupportPictureUploadResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/support/response/SupportPictureUploadResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SupportPictureUploadResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SupportPictureUploadResponse() {
        this((String[]) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public SupportPictureUploadResponse(@Nullable String[] strArr) {
        this.urls = strArr;
    }

    @g("urls")
    public static /* synthetic */ void getUrls$annotations() {
    }

    public /* synthetic */ SupportPictureUploadResponse(String[] strArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : strArr);
    }
}
