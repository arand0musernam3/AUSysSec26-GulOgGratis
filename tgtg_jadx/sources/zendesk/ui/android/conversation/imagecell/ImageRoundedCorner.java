package zendesk.ui.android.conversation.imagecell;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0013B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u0014"}, d2 = {"Lzendesk/ui/android/conversation/imagecell/ImageRoundedCorner;", "", "topLeft", "", "topRight", "bottomRight", "bottomLeft", "<init>", "(FFFF)V", "getTopLeft", "()F", "setTopLeft", "(F)V", "getTopRight", "setTopRight", "getBottomRight", "setBottomRight", "getBottomLeft", "setBottomLeft", "Builder", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageRoundedCorner {
    public static final int $stable = 8;
    private float bottomLeft;
    private float bottomRight;
    private float topLeft;
    private float topRight;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\u0006\u0010\u001b\u001a\u00020\u0012J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J1\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lzendesk/ui/android/conversation/imagecell/ImageRoundedCorner$Builder;", "", "cellRadius", "", "smallCellRadius", "direction", "Lzendesk/ui/android/conversation/imagecell/ImageCellDirection;", "isLayoutDirectionLTR", "", "<init>", "(FFLzendesk/ui/android/conversation/imagecell/ImageCellDirection;Z)V", "getCellRadius", "()F", "getSmallCellRadius", "getDirection", "()Lzendesk/ui/android/conversation/imagecell/ImageCellDirection;", "()Z", "imageRoundedCorner", "Lzendesk/ui/android/conversation/imagecell/ImageRoundedCorner;", "inboundSingle", "inboundTop", "inboundMiddle", "inboundBottom", "outboundSingle", "outboundTop", "outboundMiddle", "outboundBottom", "build", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Builder {
        public static final int $stable = 8;
        private final float cellRadius;

        @NotNull
        private final ImageCellDirection direction;

        @NotNull
        private final ImageRoundedCorner imageRoundedCorner;
        private final boolean isLayoutDirectionLTR;
        private final float smallCellRadius;

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ImageCellDirection.values().length];
                try {
                    iArr[ImageCellDirection.INBOUND_SINGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ImageCellDirection.INBOUND_TOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ImageCellDirection.INBOUND_MIDDLE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ImageCellDirection.INBOUND_BOTTOM.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ImageCellDirection.OUTBOUND_SINGLE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ImageCellDirection.OUTBOUND_TOP.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ImageCellDirection.OUTBOUND_MIDDLE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ImageCellDirection.OUTBOUND_BOTTOM.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Builder(float f11, float f12, @NotNull ImageCellDirection imageCellDirection, boolean z11) {
            imageCellDirection.getClass();
            this.cellRadius = f11;
            this.smallCellRadius = f12;
            this.direction = imageCellDirection;
            this.isLayoutDirectionLTR = z11;
            this.imageRoundedCorner = new ImageRoundedCorner(f11, f11, f11, f11, null);
        }

        public static /* synthetic */ Builder copy$default(Builder builder, float f11, float f12, ImageCellDirection imageCellDirection, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = builder.cellRadius;
            }
            if ((i11 & 2) != 0) {
                f12 = builder.smallCellRadius;
            }
            if ((i11 & 4) != 0) {
                imageCellDirection = builder.direction;
            }
            if ((i11 & 8) != 0) {
                z11 = builder.isLayoutDirectionLTR;
            }
            return builder.copy(f11, f12, imageCellDirection, z11);
        }

        private final ImageRoundedCorner inboundBottom() {
            ImageRoundedCorner imageRoundedCorner = this.imageRoundedCorner;
            boolean z11 = this.isLayoutDirectionLTR;
            float f11 = this.smallCellRadius;
            if (z11) {
                imageRoundedCorner.setTopLeft(f11);
                return imageRoundedCorner;
            }
            imageRoundedCorner.setTopRight(f11);
            return imageRoundedCorner;
        }

        private final ImageRoundedCorner inboundMiddle() {
            ImageRoundedCorner imageRoundedCorner = this.imageRoundedCorner;
            boolean z11 = this.isLayoutDirectionLTR;
            float f11 = this.smallCellRadius;
            if (z11) {
                imageRoundedCorner.setTopLeft(f11);
                imageRoundedCorner.setBottomLeft(this.smallCellRadius);
                return imageRoundedCorner;
            }
            imageRoundedCorner.setTopRight(f11);
            imageRoundedCorner.setBottomRight(this.smallCellRadius);
            return imageRoundedCorner;
        }

        private final ImageRoundedCorner inboundSingle() {
            return getImageRoundedCorner();
        }

        private final ImageRoundedCorner inboundTop() {
            ImageRoundedCorner imageRoundedCorner = this.imageRoundedCorner;
            boolean z11 = this.isLayoutDirectionLTR;
            float f11 = this.smallCellRadius;
            if (z11) {
                imageRoundedCorner.setBottomLeft(f11);
                return imageRoundedCorner;
            }
            imageRoundedCorner.setBottomRight(f11);
            return imageRoundedCorner;
        }

        private final ImageRoundedCorner outboundBottom() {
            ImageRoundedCorner imageRoundedCorner = this.imageRoundedCorner;
            boolean z11 = this.isLayoutDirectionLTR;
            float f11 = this.smallCellRadius;
            if (z11) {
                imageRoundedCorner.setTopRight(f11);
                return imageRoundedCorner;
            }
            imageRoundedCorner.setTopLeft(f11);
            return imageRoundedCorner;
        }

        private final ImageRoundedCorner outboundMiddle() {
            ImageRoundedCorner imageRoundedCorner = this.imageRoundedCorner;
            boolean z11 = this.isLayoutDirectionLTR;
            float f11 = this.smallCellRadius;
            if (z11) {
                imageRoundedCorner.setTopRight(f11);
                imageRoundedCorner.setBottomRight(this.smallCellRadius);
                return imageRoundedCorner;
            }
            imageRoundedCorner.setTopLeft(f11);
            imageRoundedCorner.setBottomLeft(this.smallCellRadius);
            return imageRoundedCorner;
        }

        /* JADX INFO: renamed from: outboundSingle, reason: from getter */
        private final ImageRoundedCorner getImageRoundedCorner() {
            return this.imageRoundedCorner;
        }

        private final ImageRoundedCorner outboundTop() {
            ImageRoundedCorner imageRoundedCorner = this.imageRoundedCorner;
            boolean z11 = this.isLayoutDirectionLTR;
            float f11 = this.smallCellRadius;
            if (z11) {
                imageRoundedCorner.setBottomRight(f11);
                return imageRoundedCorner;
            }
            imageRoundedCorner.setBottomLeft(f11);
            return imageRoundedCorner;
        }

        @NotNull
        public final ImageRoundedCorner build() {
            switch (WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()]) {
                case 1:
                    return inboundSingle();
                case 2:
                    return inboundTop();
                case 3:
                    return inboundMiddle();
                case 4:
                    return inboundBottom();
                case 5:
                    return getImageRoundedCorner();
                case 6:
                    return outboundTop();
                case 7:
                    return outboundMiddle();
                case 8:
                    return outboundBottom();
                default:
                    e40.a.f();
                    return null;
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getCellRadius() {
            return this.cellRadius;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getSmallCellRadius() {
            return this.smallCellRadius;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ImageCellDirection getDirection() {
            return this.direction;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsLayoutDirectionLTR() {
            return this.isLayoutDirectionLTR;
        }

        @NotNull
        public final Builder copy(float cellRadius, float smallCellRadius, @NotNull ImageCellDirection direction, boolean isLayoutDirectionLTR) {
            direction.getClass();
            return new Builder(cellRadius, smallCellRadius, direction, isLayoutDirectionLTR);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Float.compare(this.cellRadius, builder.cellRadius) == 0 && Float.compare(this.smallCellRadius, builder.smallCellRadius) == 0 && this.direction == builder.direction && this.isLayoutDirectionLTR == builder.isLayoutDirectionLTR;
        }

        public final float getCellRadius() {
            return this.cellRadius;
        }

        @NotNull
        public final ImageCellDirection getDirection() {
            return this.direction;
        }

        public final float getSmallCellRadius() {
            return this.smallCellRadius;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLayoutDirectionLTR) + ((this.direction.hashCode() + k.a(Float.hashCode(this.cellRadius) * 31, this.smallCellRadius, 31)) * 31);
        }

        public final boolean isLayoutDirectionLTR() {
            return this.isLayoutDirectionLTR;
        }

        @NotNull
        public String toString() {
            return "Builder(cellRadius=" + this.cellRadius + ", smallCellRadius=" + this.smallCellRadius + ", direction=" + this.direction + ", isLayoutDirectionLTR=" + this.isLayoutDirectionLTR + ")";
        }
    }

    private ImageRoundedCorner(float f11, float f12, float f13, float f14) {
        this.topLeft = f11;
        this.topRight = f12;
        this.bottomRight = f13;
        this.bottomLeft = f14;
    }

    public final float getBottomLeft() {
        return this.bottomLeft;
    }

    public final float getBottomRight() {
        return this.bottomRight;
    }

    public final float getTopLeft() {
        return this.topLeft;
    }

    public final float getTopRight() {
        return this.topRight;
    }

    public final void setBottomLeft(float f11) {
        this.bottomLeft = f11;
    }

    public final void setBottomRight(float f11) {
        this.bottomRight = f11;
    }

    public final void setTopLeft(float f11) {
        this.topLeft = f11;
    }

    public final void setTopRight(float f11) {
        this.topRight = f11;
    }

    public /* synthetic */ ImageRoundedCorner(float f11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14);
    }
}
