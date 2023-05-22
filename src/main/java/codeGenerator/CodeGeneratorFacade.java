package codeGenerator;

import codeGenerator.interfaces.IAddress;
import codeGenerator.interfaces.IMemory;
import scanner.token.Token;

public class CodeGeneratorFacade {

    private IMemory memory;
    private CodeGenerator codeGenerator;

    public CodeGeneratorFacade() {
    }

    public CodeGeneratorFacade bulidMemory(IMemory memory) {
        this.setMemory(memory);
        return this;
    }

    public CodeGeneratorFacade createCodeGenerator() {
        this.setCodeGenerator(new CodeGenerator());
        return this;
    }

    public int getDateAddress() {
        return memory.getDateAddress();
    }

    public IAddress getBoolmidiateAddress(int num) {
        return new Address(num, varType.Bool, TypeAddress.Imidiate);
    }

    public void setCodeGenerator(CodeGenerator codeGenerator) {
        this.codeGenerator = codeGenerator;
    }


    public void semanticFunction(int func, Token next) {
        codeGenerator.semanticFunction(func, next);
    }

    public void printMemory() {
        codeGenerator.printMemory();
    }

    public void setMemory(IMemory memory) {
        this.memory = memory;
    }
}