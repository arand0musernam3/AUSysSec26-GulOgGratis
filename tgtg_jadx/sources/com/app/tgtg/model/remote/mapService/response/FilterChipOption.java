package com.app.tgtg.model.remote.mapService.response;

import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001a¨\u00060"}, d2 = {"Lcom/app/tgtg/model/remote/mapService/response/FilterChipOption;", "", "Lcom/app/tgtg/model/remote/mapService/response/FilterChipId;", "id", "", "name", "nameVoiceover", "<init>", "(Lcom/app/tgtg/model/remote/mapService/response/FilterChipId;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/mapService/response/FilterChipId;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/mapService/response/FilterChipOption;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/app/tgtg/model/remote/mapService/response/FilterChipId;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/app/tgtg/model/remote/mapService/response/FilterChipId;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/mapService/response/FilterChipOption;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/mapService/response/FilterChipId;", "getId", "getId$annotations", "()V", "Ljava/lang/String;", "getName", "getName$annotations", "getNameVoiceover", "getNameVoiceover$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class FilterChipOption {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final FilterChipId id;

    @NotNull
    private final String name;

    @Nullable
    private final String nameVoiceover;

    public /* synthetic */ FilterChipOption(int i11, FilterChipId filterChipId, String str, String str2, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, FilterChipOption$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = filterChipId;
        this.name = str;
        if ((i11 & 4) == 0) {
            this.nameVoiceover = null;
        } else {
            this.nameVoiceover = str2;
        }
    }

    public static /* synthetic */ FilterChipOption copy$default(FilterChipOption filterChipOption, FilterChipId filterChipId, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            filterChipId = filterChipOption.id;
        }
        if ((i11 & 2) != 0) {
            str = filterChipOption.name;
        }
        if ((i11 & 4) != 0) {
            str2 = filterChipOption.nameVoiceover;
        }
        return filterChipOption.copy(filterChipId, str, str2);
    }

    public static final /* synthetic */ void write$Self$app(FilterChipOption self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, FilterChipIdSerializer.INSTANCE, self.id);
        output.q(serialDesc, 1, self.name);
        if (!output.C(serialDesc) && self.nameVoiceover == null) {
            return;
        }
        output.r(serialDesc, 2, r1.f29848a, self.nameVoiceover);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FilterChipId getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNameVoiceover() {
        return this.nameVoiceover;
    }

    @NotNull
    public final FilterChipOption copy(@NotNull FilterChipId id2, @NotNull String name, @Nullable String nameVoiceover) {
        id2.getClass();
        name.getClass();
        return new FilterChipOption(id2, name, nameVoiceover);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterChipOption)) {
            return false;
        }
        FilterChipOption filterChipOption = (FilterChipOption) other;
        return this.id == filterChipOption.id && Intrinsics.areEqual(this.name, filterChipOption.name) && Intrinsics.areEqual(this.nameVoiceover, filterChipOption.nameVoiceover);
    }

    @NotNull
    public final FilterChipId getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNameVoiceover() {
        return this.nameVoiceover;
    }

    public int hashCode() {
        int iB = l1.b(this.id.hashCode() * 31, 31, this.name);
        String str = this.nameVoiceover;
        return iB + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        FilterChipId filterChipId = this.id;
        String str = this.name;
        String str2 = this.nameVoiceover;
        StringBuilder sb2 = new StringBuilder("FilterChipOption(id=");
        sb2.append(filterChipId);
        sb2.append(", name=");
        sb2.append(str);
        sb2.append(", nameVoiceover=");
        return k.p(sb2, str2, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/mapService/response/FilterChipOption$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/mapService/response/FilterChipOption;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FilterChipOption$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @g("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @g("name_voiceover")
    public static /* synthetic */ void getNameVoiceover$annotations() {
    }

    public FilterChipOption(@NotNull FilterChipId filterChipId, @NotNull String str, @Nullable String str2) {
        filterChipId.getClass();
        str.getClass();
        this.id = filterChipId;
        this.name = str;
        this.nameVoiceover = str2;
    }

    public /* synthetic */ FilterChipOption(FilterChipId filterChipId, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(filterChipId, str, (i11 & 4) != 0 ? null : str2);
    }
}
