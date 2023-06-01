
def av(subjects, qualifications):
    average = 0
    if (len(subs_qualis)  == number_of_subj):
        print(f"Number of subjects coursed: {len(subs_qualis)}")
        for x in subs_qualis:
            average += x;
    
        return average / number_of_subj;
        
        
    else:
        raise ValueError (f"Number of subjects does not correspond to the input quantity of qn.")


number_of_subj = int(input("How many subjects do you course? - "))

# number_of_subj = 5
i = 1
subs_qualis = []
        
while(i <= number_of_subj):
    qn = int(input("Give me value: "))
    if qn > 10 or qn < 3:
        raise ValueError(f"Invalid value {qn}, subjects should be more than 3 and less than 10.")
    subs_qualis.append(qn)
    i+=1

print(f"{av(number_of_subj,subs_qualis)}")

    

