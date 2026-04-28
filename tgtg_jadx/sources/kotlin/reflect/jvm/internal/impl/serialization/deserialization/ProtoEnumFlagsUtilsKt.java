package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProtoEnumFlagsUtilsKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ProtoBuf.MemberKind.values().length];
            try {
                iArr[ProtoBuf.MemberKind.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.MemberKind.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.MemberKind.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf.MemberKind.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CallableMemberDescriptor.Kind.values().length];
            try {
                iArr2[CallableMemberDescriptor.Kind.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CallableMemberDescriptor.Kind.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CallableMemberDescriptor.Kind.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CallableMemberDescriptor.Kind.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ProtoBuf.Visibility.values().length];
            try {
                iArr3[ProtoBuf.Visibility.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ProtoBuf.Visibility.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @NotNull
    public static final DescriptorVisibility descriptorVisibility(@NotNull ProtoEnumFlags protoEnumFlags, @Nullable ProtoBuf.Visibility visibility) {
        protoEnumFlags.getClass();
        switch (visibility == null ? -1 : WhenMappings.$EnumSwitchMapping$2[visibility.ordinal()]) {
            case 1:
                DescriptorVisibility descriptorVisibility = DescriptorVisibilities.INTERNAL;
                descriptorVisibility.getClass();
                return descriptorVisibility;
            case 2:
                DescriptorVisibility descriptorVisibility2 = DescriptorVisibilities.PRIVATE;
                descriptorVisibility2.getClass();
                return descriptorVisibility2;
            case 3:
                DescriptorVisibility descriptorVisibility3 = DescriptorVisibilities.PRIVATE_TO_THIS;
                descriptorVisibility3.getClass();
                return descriptorVisibility3;
            case 4:
                DescriptorVisibility descriptorVisibility4 = DescriptorVisibilities.PROTECTED;
                descriptorVisibility4.getClass();
                return descriptorVisibility4;
            case 5:
                DescriptorVisibility descriptorVisibility5 = DescriptorVisibilities.PUBLIC;
                descriptorVisibility5.getClass();
                return descriptorVisibility5;
            case 6:
                DescriptorVisibility descriptorVisibility6 = DescriptorVisibilities.LOCAL;
                descriptorVisibility6.getClass();
                return descriptorVisibility6;
            default:
                DescriptorVisibility descriptorVisibility7 = DescriptorVisibilities.PRIVATE;
                descriptorVisibility7.getClass();
                return descriptorVisibility7;
        }
    }

    @NotNull
    public static final CallableMemberDescriptor.Kind memberKind(@NotNull ProtoEnumFlags protoEnumFlags, @Nullable ProtoBuf.MemberKind memberKind) {
        protoEnumFlags.getClass();
        int i11 = memberKind == null ? -1 : WhenMappings.$EnumSwitchMapping$0[memberKind.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? CallableMemberDescriptor.Kind.DECLARATION : CallableMemberDescriptor.Kind.SYNTHESIZED : CallableMemberDescriptor.Kind.DELEGATION : CallableMemberDescriptor.Kind.FAKE_OVERRIDE : CallableMemberDescriptor.Kind.DECLARATION;
    }
}
