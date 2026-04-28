package com.app.tgtg.model.remote.discover.response;

import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0005¨\u0006("}, d2 = {"Lcom/app/tgtg/model/remote/discover/response/DiscoverSingleBucketResponse;", "", "Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;", "bucket", "<init>", "(Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/discover/response/DiscoverBucket;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/discover/response/DiscoverSingleBucketResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;", "copy", "(Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;)Lcom/app/tgtg/model/remote/discover/response/DiscoverSingleBucketResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;", "getBucket", "setBucket", "getBucket$annotations", "()V", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DiscoverSingleBucketResponse {

    @NotNull
    private DiscoverBucket bucket;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ DiscoverSingleBucketResponse(int i11, DiscoverBucket discoverBucket, m1 m1Var) {
        if (1 == (i11 & 1)) {
            this.bucket = discoverBucket;
        } else {
            c1.j(i11, 1, DiscoverSingleBucketResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ DiscoverSingleBucketResponse copy$default(DiscoverSingleBucketResponse discoverSingleBucketResponse, DiscoverBucket discoverBucket, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            discoverBucket = discoverSingleBucketResponse.bucket;
        }
        return discoverSingleBucketResponse.copy(discoverBucket);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DiscoverBucket getBucket() {
        return this.bucket;
    }

    @NotNull
    public final DiscoverSingleBucketResponse copy(@NotNull DiscoverBucket bucket) {
        bucket.getClass();
        return new DiscoverSingleBucketResponse(bucket);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DiscoverSingleBucketResponse) && Intrinsics.areEqual(this.bucket, ((DiscoverSingleBucketResponse) other).bucket);
    }

    @NotNull
    public final DiscoverBucket getBucket() {
        return this.bucket;
    }

    public int hashCode() {
        return this.bucket.hashCode();
    }

    public final void setBucket(@NotNull DiscoverBucket discoverBucket) {
        discoverBucket.getClass();
        this.bucket = discoverBucket;
    }

    @NotNull
    public String toString() {
        return "DiscoverSingleBucketResponse(bucket=" + this.bucket + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/discover/response/DiscoverSingleBucketResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/discover/response/DiscoverSingleBucketResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DiscoverSingleBucketResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("mobile_bucket")
    public static /* synthetic */ void getBucket$annotations() {
    }

    public DiscoverSingleBucketResponse(@NotNull DiscoverBucket discoverBucket) {
        discoverBucket.getClass();
        this.bucket = discoverBucket;
    }
}
