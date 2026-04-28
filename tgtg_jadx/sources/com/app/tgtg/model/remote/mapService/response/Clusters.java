package com.app.tgtg.model.remote.mapService.response;

import com.app.tgtg.model.remote.mapService.GeoLocation;
import com.app.tgtg.model.remote.mapService.GeoLocation$$serializer;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/app/tgtg/model/remote/mapService/response/Clusters;", "", "Lcom/app/tgtg/model/remote/mapService/GeoLocation;", "location", "", "count", "<init>", "(Lcom/app/tgtg/model/remote/mapService/GeoLocation;I)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/mapService/GeoLocation;ILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/mapService/response/Clusters;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/app/tgtg/model/remote/mapService/GeoLocation;", "getLocation", "()Lcom/app/tgtg/model/remote/mapService/GeoLocation;", "getLocation$annotations", "()V", "I", "getCount", "()I", "getCount$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Clusters {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int count;

    @NotNull
    private final GeoLocation location;

    public /* synthetic */ Clusters(int i11, GeoLocation geoLocation, int i12, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, Clusters$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.location = geoLocation;
        this.count = i12;
    }

    public static final /* synthetic */ void write$Self$app(Clusters self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, GeoLocation$$serializer.INSTANCE, self.location);
        output.m(1, self.count, serialDesc);
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final GeoLocation getLocation() {
        return this.location;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/mapService/response/Clusters$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/mapService/response/Clusters;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Clusters$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("count")
    public static /* synthetic */ void getCount$annotations() {
    }

    @g("location")
    public static /* synthetic */ void getLocation$annotations() {
    }

    public Clusters(@NotNull GeoLocation geoLocation, int i11) {
        geoLocation.getClass();
        this.location = geoLocation;
        this.count = i11;
    }
}
