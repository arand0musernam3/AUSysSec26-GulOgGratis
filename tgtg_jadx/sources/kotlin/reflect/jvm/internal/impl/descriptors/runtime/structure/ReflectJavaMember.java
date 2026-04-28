package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nReflectJavaMember.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaMember.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaMember\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
public abstract class ReflectJavaMember extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaMember {
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaMember) && Intrinsics.areEqual(getMember(), ((ReflectJavaMember) obj).getMember());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    public ReflectJavaAnnotation findAnnotation(FqName fqName) {
        Annotation[] declaredAnnotations;
        fqName.getClass();
        AnnotatedElement element = getElement();
        if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
            return null;
        }
        return ReflectJavaAnnotationOwnerKt.findAnnotation(declaredAnnotations, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public List<ReflectJavaAnnotation> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<ReflectJavaAnnotation> annotations;
        AnnotatedElement element = getElement();
        return (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null || (annotations = ReflectJavaAnnotationOwnerKt.getAnnotations(declaredAnnotations)) == null) ? n0.f26529a : annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember
    @NotNull
    public ReflectJavaClass getContainingClass() {
        Class<?> declaringClass = getMember().getDeclaringClass();
        declaringClass.getClass();
        return new ReflectJavaClass(declaringClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    @NotNull
    public AnnotatedElement getElement() {
        Member member = getMember();
        member.getClass();
        return (AnnotatedElement) member;
    }

    @NotNull
    public abstract Member getMember();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return getMember().getModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    @NotNull
    public Name getName() {
        String name = getMember().getName();
        Name nameIdentifier = name != null ? Name.identifier(name) : null;
        return nameIdentifier == null ? SpecialNames.NO_NAME_PROVIDED : nameIdentifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter> getValueParameters(@org.jetbrains.annotations.NotNull java.lang.reflect.Type[] r12, @org.jetbrains.annotations.NotNull java.lang.annotation.Annotation[][] r13, boolean r14) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r11 = this;
            r12.getClass()
            r13.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.length
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java8ParameterNamesLoader r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java8ParameterNamesLoader.INSTANCE
            java.lang.reflect.Member r2 = r11.getMember()
            java.util.List r1 = r1.loadParameterNames(r2)
            r2 = 0
            if (r1 == 0) goto L20
            int r3 = r1.size()
            int r4 = r12.length
            int r3 = r3 - r4
            goto L21
        L20:
            r3 = r2
        L21:
            int r4 = r12.length
            r5 = r2
        L23:
            if (r5 >= r4) goto L8d
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType$Factory r6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType.Factory
            r7 = r12[r5]
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType r6 = r6.create(r7)
            if (r1 == 0) goto L76
            int r7 = r5 + r3
            java.lang.Object r7 = kotlin.collections.CollectionsKt.Q(r7, r1)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L3a
            goto L77
        L3a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            kotlin.reflect.jvm.internal.impl.name.Name r13 = r11.getName()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "No parameter with index "
            r14.<init>(r0)
            r14.append(r5)
            r0 = 43
            r14.append(r0)
            r14.append(r3)
            java.lang.String r0 = " (name="
            r14.append(r0)
            r14.append(r13)
            java.lang.String r13 = " type="
            r14.append(r13)
            r14.append(r6)
            java.lang.String r13 = ") in "
            r14.append(r13)
            r14.append(r11)
            java.lang.String r13 = r14.toString()
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L76:
            r7 = 0
        L77:
            if (r14 == 0) goto L7f
            int r8 = r12.length
            r9 = 1
            int r8 = r8 - r9
            if (r5 != r8) goto L7f
            goto L80
        L7f:
            r9 = r2
        L80:
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaValueParameter r8 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaValueParameter
            r10 = r13[r5]
            r8.<init>(r6, r10, r7, r9)
            r0.add(r8)
            int r5 = r5 + 1
            goto L23
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember.getValueParameters(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.List");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    @NotNull
    public Visibility getVisibility() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? Visibilities.Public.INSTANCE : Modifier.isPrivate(modifiers) ? Visibilities.Private.INSTANCE : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? JavaVisibilities.ProtectedStaticVisibility.INSTANCE : JavaVisibilities.ProtectedAndPackage.INSTANCE : JavaVisibilities.PackageVisibility.INSTANCE;
    }

    public int hashCode() {
        return getMember().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }

    @NotNull
    public String toString() {
        return getClass().getName() + ": " + getMember();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ JavaAnnotation findAnnotation(FqName fqName) {
        return findAnnotation(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }
}
