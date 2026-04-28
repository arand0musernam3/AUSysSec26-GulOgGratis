package com.app.tgtg.model.remote.manufacturer.request;

import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.LatLngInfo$$serializer;
import e0.f;
import eu.a;
import i90.g;
import i90.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 92\u00020\u0001:\u00029:BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB_\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JV\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001bR&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010\u001bR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b2\u0010.\u001a\u0004\b1\u0010\u001bR \u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00103\u0012\u0004\b5\u0010.\u001a\u0004\b4\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b8\u0010.\u001a\u0004\b7\u0010!¨\u0006;"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/ManufacturerItemsV2Request;", "", "", "", "displayTypesAccepted", "elementTypesAccepted", "actionTypesAccepted", "searchQuery", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "geoLocation", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/request/ManufacturerItemsV2Request;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "()Lcom/app/tgtg/model/remote/item/LatLngInfo;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/app/tgtg/model/remote/item/LatLngInfo;)Lcom/app/tgtg/model/remote/manufacturer/request/ManufacturerItemsV2Request;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDisplayTypesAccepted", "getDisplayTypesAccepted$annotations", "()V", "getElementTypesAccepted", "getElementTypesAccepted$annotations", "getActionTypesAccepted", "getActionTypesAccepted$annotations", "Ljava/lang/String;", "getSearchQuery", "getSearchQuery$annotations", "Lcom/app/tgtg/model/remote/item/LatLngInfo;", "getGeoLocation", "getGeoLocation$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ManufacturerItemsV2Request {

    @NotNull
    private static final j[] $childSerializers;

    @NotNull
    private final List<String> actionTypesAccepted;

    @NotNull
    private final List<String> displayTypesAccepted;

    @NotNull
    private final List<String> elementTypesAccepted;

    @Nullable
    private final LatLngInfo geoLocation;

    @NotNull
    private final String searchQuery;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new a(0)), l.a(mVar, new a(1)), l.a(mVar, new a(2)), null, null};
    }

    public /* synthetic */ ManufacturerItemsV2Request(int i11, List list, List list2, List list3, String str, LatLngInfo latLngInfo, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, ManufacturerItemsV2Request$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.displayTypesAccepted = list;
        this.elementTypesAccepted = list2;
        this.actionTypesAccepted = list3;
        this.searchQuery = str;
        if ((i11 & 16) == 0) {
            this.geoLocation = null;
        } else {
            this.geoLocation = latLngInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(r1.f29848a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(r1.f29848a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new d(r1.f29848a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ManufacturerItemsV2Request copy$default(ManufacturerItemsV2Request manufacturerItemsV2Request, List list, List list2, List list3, String str, LatLngInfo latLngInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = manufacturerItemsV2Request.displayTypesAccepted;
        }
        if ((i11 & 2) != 0) {
            list2 = manufacturerItemsV2Request.elementTypesAccepted;
        }
        if ((i11 & 4) != 0) {
            list3 = manufacturerItemsV2Request.actionTypesAccepted;
        }
        if ((i11 & 8) != 0) {
            str = manufacturerItemsV2Request.searchQuery;
        }
        if ((i11 & 16) != 0) {
            latLngInfo = manufacturerItemsV2Request.geoLocation;
        }
        LatLngInfo latLngInfo2 = latLngInfo;
        List list4 = list3;
        return manufacturerItemsV2Request.copy(list, list2, list4, str, latLngInfo2);
    }

    public static final /* synthetic */ void write$Self$app(ManufacturerItemsV2Request self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.displayTypesAccepted);
        output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.elementTypesAccepted);
        output.i(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.actionTypesAccepted);
        output.q(serialDesc, 3, self.searchQuery);
        if (!output.C(serialDesc) && self.geoLocation == null) {
            return;
        }
        output.r(serialDesc, 4, LatLngInfo$$serializer.INSTANCE, self.geoLocation);
    }

    @NotNull
    public final List<String> component1() {
        return this.displayTypesAccepted;
    }

    @NotNull
    public final List<String> component2() {
        return this.elementTypesAccepted;
    }

    @NotNull
    public final List<String> component3() {
        return this.actionTypesAccepted;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LatLngInfo getGeoLocation() {
        return this.geoLocation;
    }

    @NotNull
    public final ManufacturerItemsV2Request copy(@NotNull List<String> displayTypesAccepted, @NotNull List<String> elementTypesAccepted, @NotNull List<String> actionTypesAccepted, @NotNull String searchQuery, @Nullable LatLngInfo geoLocation) {
        displayTypesAccepted.getClass();
        elementTypesAccepted.getClass();
        actionTypesAccepted.getClass();
        searchQuery.getClass();
        return new ManufacturerItemsV2Request(displayTypesAccepted, elementTypesAccepted, actionTypesAccepted, searchQuery, geoLocation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManufacturerItemsV2Request)) {
            return false;
        }
        ManufacturerItemsV2Request manufacturerItemsV2Request = (ManufacturerItemsV2Request) other;
        return Intrinsics.areEqual(this.displayTypesAccepted, manufacturerItemsV2Request.displayTypesAccepted) && Intrinsics.areEqual(this.elementTypesAccepted, manufacturerItemsV2Request.elementTypesAccepted) && Intrinsics.areEqual(this.actionTypesAccepted, manufacturerItemsV2Request.actionTypesAccepted) && Intrinsics.areEqual(this.searchQuery, manufacturerItemsV2Request.searchQuery) && Intrinsics.areEqual(this.geoLocation, manufacturerItemsV2Request.geoLocation);
    }

    @NotNull
    public final List<String> getActionTypesAccepted() {
        return this.actionTypesAccepted;
    }

    @NotNull
    public final List<String> getDisplayTypesAccepted() {
        return this.displayTypesAccepted;
    }

    @NotNull
    public final List<String> getElementTypesAccepted() {
        return this.elementTypesAccepted;
    }

    @Nullable
    public final LatLngInfo getGeoLocation() {
        return this.geoLocation;
    }

    @NotNull
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public int hashCode() {
        int iB = l1.b(f.c(this.actionTypesAccepted, f.c(this.elementTypesAccepted, this.displayTypesAccepted.hashCode() * 31, 31), 31), 31, this.searchQuery);
        LatLngInfo latLngInfo = this.geoLocation;
        return iB + (latLngInfo == null ? 0 : latLngInfo.hashCode());
    }

    @NotNull
    public String toString() {
        return "ManufacturerItemsV2Request(displayTypesAccepted=" + this.displayTypesAccepted + ", elementTypesAccepted=" + this.elementTypesAccepted + ", actionTypesAccepted=" + this.actionTypesAccepted + ", searchQuery=" + this.searchQuery + ", geoLocation=" + this.geoLocation + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¨\u0006\f"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/request/ManufacturerItemsV2Request$Companion;", "", "<init>", "()V", "getKnownGroupTypes", "", "", "getKnownElementTypes", "getKnownActionTypes", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/request/ManufacturerItemsV2Request;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nManufacturerItemsRequestV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManufacturerItemsRequestV2.kt\ncom/app/tgtg/model/remote/manufacturer/request/ManufacturerItemsV2Request$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,183:1\n11693#2:184\n12040#2,3:185\n11693#2:188\n12040#2,3:189\n11693#2:192\n12040#2,3:193\n*S KotlinDebug\n*F\n+ 1 ManufacturerItemsRequestV2.kt\ncom/app/tgtg/model/remote/manufacturer/request/ManufacturerItemsV2Request$Companion\n*L\n24#1:184\n24#1:185,3\n26#1:188\n26#1:189,3\n28#1:192\n28#1:193,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<String> getKnownActionTypes() {
            ArrayList arrayList;
            ActionType[] actionTypeArr = (ActionType[]) ActionType.class.getEnumConstants();
            if (actionTypeArr != null) {
                arrayList = new ArrayList(actionTypeArr.length);
                for (ActionType actionType : actionTypeArr) {
                    arrayList.add(actionType.name());
                }
            } else {
                arrayList = null;
            }
            return arrayList == null ? n0.f26529a : arrayList;
        }

        @NotNull
        public final List<String> getKnownElementTypes() {
            ArrayList arrayList;
            ElementType[] elementTypeArr = (ElementType[]) ElementType.class.getEnumConstants();
            if (elementTypeArr != null) {
                arrayList = new ArrayList(elementTypeArr.length);
                for (ElementType elementType : elementTypeArr) {
                    arrayList.add(elementType.name());
                }
            } else {
                arrayList = null;
            }
            return arrayList == null ? n0.f26529a : arrayList;
        }

        @NotNull
        public final List<String> getKnownGroupTypes() {
            ArrayList arrayList;
            TypeMnuV2[] typeMnuV2Arr = (TypeMnuV2[]) TypeMnuV2.class.getEnumConstants();
            if (typeMnuV2Arr != null) {
                arrayList = new ArrayList(typeMnuV2Arr.length);
                for (TypeMnuV2 typeMnuV2 : typeMnuV2Arr) {
                    arrayList.add(typeMnuV2.name());
                }
            } else {
                arrayList = null;
            }
            return arrayList == null ? n0.f26529a : arrayList;
        }

        @NotNull
        public final KSerializer serializer() {
            return ManufacturerItemsV2Request$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("action_types_accepted")
    public static /* synthetic */ void getActionTypesAccepted$annotations() {
    }

    @g("display_types_accepted")
    public static /* synthetic */ void getDisplayTypesAccepted$annotations() {
    }

    @g("element_types_accepted")
    public static /* synthetic */ void getElementTypesAccepted$annotations() {
    }

    @g("geo_location")
    public static /* synthetic */ void getGeoLocation$annotations() {
    }

    @g("query")
    public static /* synthetic */ void getSearchQuery$annotations() {
    }

    public ManufacturerItemsV2Request(@NotNull List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull String str, @Nullable LatLngInfo latLngInfo) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        str.getClass();
        this.displayTypesAccepted = list;
        this.elementTypesAccepted = list2;
        this.actionTypesAccepted = list3;
        this.searchQuery = str;
        this.geoLocation = latLngInfo;
    }

    public /* synthetic */ ManufacturerItemsV2Request(List list, List list2, List list3, String str, LatLngInfo latLngInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, str, (i11 & 16) != 0 ? null : latLngInfo);
    }
}
