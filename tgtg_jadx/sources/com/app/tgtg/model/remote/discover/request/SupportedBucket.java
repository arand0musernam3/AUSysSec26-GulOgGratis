package com.app.tgtg.model.remote.discover.request;

import i90.a;
import i90.g;
import i90.h;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m90.d;
import m90.m1;
import m90.r1;
import nq.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import zendesk.ui.android.conversation.composer.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0019R4\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001b¨\u0006."}, d2 = {"Lcom/app/tgtg/model/remote/discover/request/SupportedBucket;", "", "", "type", "Ljava/util/ArrayList;", "Lnq/o;", "Lkotlin/collections/ArrayList;", "displayTypes", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/ArrayList;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/discover/request/SupportedBucket;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/ArrayList;", "copy", "(Ljava/lang/String;Ljava/util/ArrayList;)Lcom/app/tgtg/model/remote/discover/request/SupportedBucket;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "Ljava/util/ArrayList;", "getDisplayTypes", "getDisplayTypes$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SupportedBucket {

    @Nullable
    private final ArrayList<o> displayTypes;

    @Nullable
    private final String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new b(21))};

    public /* synthetic */ SupportedBucket(int i11, String str, ArrayList arrayList, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i11 & 2) == 0) {
            this.displayTypes = null;
        } else {
            this.displayTypes = arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        o[] oVarArrValues = o.values();
        oVarArrValues.getClass();
        return new d(new a("com.app.tgtg.feature.tabdiscover.model.buckets.SupportedBucketsDisplayTypes", (Enum[]) oVarArrValues), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportedBucket copy$default(SupportedBucket supportedBucket, String str, ArrayList arrayList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = supportedBucket.type;
        }
        if ((i11 & 2) != 0) {
            arrayList = supportedBucket.displayTypes;
        }
        return supportedBucket.copy(str, arrayList);
    }

    public static final /* synthetic */ void write$Self$app(SupportedBucket self, l90.b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.type != null) {
            output.r(serialDesc, 0, r1.f29848a, self.type);
        }
        if (!output.C(serialDesc) && self.displayTypes == null) {
            return;
        }
        output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.displayTypes);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final ArrayList<o> component2() {
        return this.displayTypes;
    }

    @NotNull
    public final SupportedBucket copy(@Nullable String type, @Nullable ArrayList<o> displayTypes) {
        return new SupportedBucket(type, displayTypes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportedBucket)) {
            return false;
        }
        SupportedBucket supportedBucket = (SupportedBucket) other;
        return Intrinsics.areEqual(this.type, supportedBucket.type) && Intrinsics.areEqual(this.displayTypes, supportedBucket.displayTypes);
    }

    @Nullable
    public final ArrayList<o> getDisplayTypes() {
        return this.displayTypes;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ArrayList<o> arrayList = this.displayTypes;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SupportedBucket(type=" + this.type + ", displayTypes=" + this.displayTypes + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/discover/request/SupportedBucket$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/discover/request/SupportedBucket;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SupportedBucket$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("display_types")
    public static /* synthetic */ void getDisplayTypes$annotations() {
    }

    @g("type")
    public static /* synthetic */ void getType$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SupportedBucket() {
        this((String) null, (ArrayList) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public SupportedBucket(@Nullable String str, @Nullable ArrayList<o> arrayList) {
        this.type = str;
        this.displayTypes = arrayList;
    }

    public /* synthetic */ SupportedBucket(String str, ArrayList arrayList, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : arrayList);
    }
}
