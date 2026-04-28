package com.app.tgtg.model.remote.item.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n90.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class BasicItem$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0 implements i {
    private final /* synthetic */ String discriminator;

    public BasicItem$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0(@NotNull String str) {
        str.getClass();
        this.discriminator = str;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return i.class;
    }

    @Override // n90.i
    public final /* synthetic */ String discriminator() {
        return this.discriminator;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof i) && Intrinsics.areEqual(discriminator(), ((i) obj).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return this.discriminator.hashCode() ^ 707790692;
    }

    @Override // java.lang.annotation.Annotation
    @NotNull
    public final String toString() {
        return a0.p("@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=", this.discriminator, ")");
    }
}
